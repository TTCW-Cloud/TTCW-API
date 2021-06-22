package com.wznln.mc.api;

public class Printer {
    public static void PrintConsole(Object text){
        if(text==null) text = "source is null";
        else System.out.println(text.toString().replace("&","§"));
    }
}
