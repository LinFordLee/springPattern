package com.linford.vip.springpattern.springDelegate.mvc;

import com.linford.vip.springpattern.springDelegate.mvc.controllers.MemberAction;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 委派模式
 */
//相当于项目经理的角色
public class DispatcherServlet {
    private List<Handler> handlerMapping=new ArrayList<Handler>();

    public  DispatcherServlet(){
        try {
            Class<?> memberActionClass= MemberAction.class;
            handlerMapping.add(new Handler()
                    .setController(memberActionClass.newInstance())
                    .setMethod(memberActionClass.getMethod("getMemberById",new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void doService(HttpServletRequest request, HttpServletResponse response){
        doDispatch(request,response);
    }
    public void doDispatch(HttpServletRequest request, HttpServletResponse response){
        //1.获取用户请求的url
        //若按照J2EE的标准，每个url对应一个servlet，url由浏览器输入
        String uri=request.getRequestURI();
        //2.Servlet拿到url以后，要做权衡(要做判断和选择)
        //根据用户请求的URL,去找到这个url对应的某个java类的方法

        //3.通过拿到的URL取handlerMapping（认为是策略常量）
        Handler handler=null;
        for (Handler h: handlerMapping) {
            if (uri.equals(h.getUrl())){
                handler=h;
                break;
            }
        }
        //4.将具体的任务分发给Method(通过反射去调用其对应的方法)
        Object object=null;
        try {
            object=handler.getMethod().invoke(handler.getController(),request.getParameter("mid"));
        }catch (Exception e){
            e.printStackTrace();
        }
        //5/获取到Method执行的结果，通过response返回
//        response.getWriter().write();
    }




    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController(){
            return controller;
        }
        public Handler setController(Object controller){
            this.controller=controller;
            return  this;
        }
        public  Method getMethod(){return  method;}

        public Handler setMethod(Method method){
            this.method=method;
            return  this;
        }
        public  String getUrl(){return  url;}

        public  Handler setUrl(String url){
            this.url=url;
            return this;
        }
    }
}
