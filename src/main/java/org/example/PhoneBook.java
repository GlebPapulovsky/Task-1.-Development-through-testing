package org.example;

import java.util.HashMap;

public class PhoneBook {
    HashMap<String,String>map=new HashMap<>();


    public int add(String name,String number){
        if(!map.containsKey(name)){
            map.put(name,number);
            return map.size();
        }
        return 0;
    }
    public String findByNumber(String number){
        return "";
    }

}
