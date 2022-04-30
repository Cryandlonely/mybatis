package com.cj.utils;

public class ServiceFactory {
    public static Object getService(Object service){
        return new Handler(service).getProxy();
    }
}
