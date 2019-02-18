package com.example.demo.ExampleArrayList;

import java.util.HashMap;
import java.util.UUID;

public class NotSafeHashMap {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        for (int i = 0; i <=30; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,4));
                System.out.println(map);
            },String.valueOf(i)).start();
        }
    }
}
