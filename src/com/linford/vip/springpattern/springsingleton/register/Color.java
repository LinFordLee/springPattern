package com.linford.vip.springpattern.springsingleton.register;

public enum Color {
    RED{
        private int r=255;
        private int g=0;
        private int b=0;
    },
    BLACK{
        private int r=0;
        private int g=0;
        private int b=0;
    };

    private Color (){}
}
