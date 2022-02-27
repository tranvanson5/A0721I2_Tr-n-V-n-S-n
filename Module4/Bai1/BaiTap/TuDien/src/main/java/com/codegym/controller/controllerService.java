package com.codegym.controller;

import java.util.HashMap;
import java.util.Map;

public class controllerService {
    static Map<String, String> map= new HashMap<>();
    static {
        map.put("hello","xin chao");
        map.put("dog","cho");
        map.put("five","nam");
    }
    public String search(String key){
        for(Map.Entry<String , String> entry : map.entrySet()) {
            if(entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

}
