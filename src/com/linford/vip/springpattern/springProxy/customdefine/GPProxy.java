package com.linford.vip.springpattern.springProxy.customdefine;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class GPProxy {
    public static  final String ln="\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader,Class<?> [] interfaces,GPInvocationHandler h){
        try{
            //1.动态生成源代码.java文件
            String src=generateSrc(interfaces);
            //2.java文件输出磁盘
            String filePath=GPProxy.class.getResource("").getPath();
            System.out.println("输出文件路径："+filePath);
            File f=new File(filePath+"$Proxy0.java");
            FileWriter fw=new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            //把生成的.java文件编译成.class文件
            JavaCompiler compiler= ToolProvider.getSystemJavaCompiler();//获取此平台提供的 Java™ 编程语言编译器,若没有则null
            /**
             * 接口 StandardJavaFileManager
             * 基于 java.io.File 的文件管理器。获取此类实例的一般方法是使用 getStandardFileManager
             * StandardJavaFileManager getStandardFileManager(DiagnosticListener<? super JavaFileObject> diagnosticListener,
             *                                                Locale locale,
             *                                                Charset charset)
             *参数：
             * diagnosticListener - 用于非致命诊断信息的诊断侦听器；如果为 null，则使用编译器的默认方法来报告诊断信息
             * locale - 格式化诊断信息时要应用的语言环境；如果为 null，则使用 默认语言环境。
             * charset - 用于解码字节的字符集；如果为 null，则使用平台默认的字符集
             * 返回:标准文件管理器
             */
            StandardJavaFileManager manager=compiler.getStandardFileManager(null,null,null);//为此工具获取一个标准文件管理器实现的新实例
            Iterable iterable=manager.getJavaFileObjects(f);//获取表示给定文件名称的文件对象。

            /**
             * JavaCompiler.CompilationTask getTask(Writer out,
             *                                      JavaFileManager fileManager,
             *                                      DiagnosticListener<? super JavaFileObject> diagnosticListener,
             *                                      Iterable<String> options,
             *                                      Iterable<String> classes,
             *                                      Iterable<? extends JavaFileObject> compilationUnits)
             *   使用给定组件和参数创建编译任务的 future
             *   如果提供了文件管理器，则它必须能够处理 StandardLocation 中定义的所有位置。
             *   out - 用于来自编译器的其他输出的 Writer；如果为 null，则使用 System.err
             *   fileManager - 文件管理器；如果为 null，则使用编译器的标准文件管理器
             *   diagnosticListener - 诊断侦听器；如果为 null，则使用编译器的默认方法报告诊断信息
             *   options - 编译器选项； null 表示没有选项
             *   classes - 类名称（用于注释处理）， null 表示没有类名称
             *   compilationUnits - 要编译的编译单元； null 表示没有编译单元
             * 返回：表示编译的对象
             */
            JavaCompiler.CompilationTask task=compiler.getTask(null,manager,null,null,null,iterable);
            task.call();//执行此编译任务。编译只能被执行一次。此方法的后续调用将抛出 IllegalStateException。
            manager.close();//如果调用 flush 或 close 后访问标准文件管理器，则它将被自动重新打开。
            //4.编译生成的.class文件加载到JVM中来
            Class proxyClass =  classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            f.delete();
            //5.返回字节码重组以后的新的代理对象
            return c.newInstance(h);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 动态生成源代码.java文件
     * @param interfaces
     * @return
     */
    private static String generateSrc(Class<?> [] interfaces){
        StringBuffer sb=new StringBuffer();
        sb.append("package com.linford.vip.springpattern.springProxy.customdefine;"+ln);
        sb.append("import com.linford.vip.springpattern.springProxy.staticed.Person;"+ln);
        sb.append("import java.lang.reflect.Method;"+ln);
        sb.append("public class $Proxy0 implements "+interfaces[0].getName()+"{"+ln);

            sb.append("GPInvocationHandler h;"+ln);

            sb.append("public $Proxy0 (GPInvocationHandler h) {"+ln);

                sb.append("this.h=h;");

            sb.append("}"+ln);


            for (Method m:interfaces[0].getMethods()){
                sb.append("public "+m.getReturnType().getName()+" "+m.getName()+"() {"+ln);
                    sb.append("try{"+ln);
                        sb.append("Method m="+interfaces[0].getName()+".class.getMethod(\""+m.getName()+"\",new Class[]{});"+ln);
                        sb.append("this.h.invoke(this,m,null);"+ln);
                    sb.append("}catch(Throwable e){"+ln);
                    sb.append("e.printStackTrace();"+ln);
                    sb.append("}");
                sb.append("}");
            }
            sb.append("}"+ln);

        return sb.toString();
    }
}
