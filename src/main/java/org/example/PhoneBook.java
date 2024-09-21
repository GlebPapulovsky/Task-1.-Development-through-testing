package org.example;

import java.lang.reflect.Array;
import java.util.*;

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
        for(String key:map.keySet()){
            if (map.get(key).equals(number)){
                return key;
            }
        }
        return "No one";
    }
    public String findByName(String name){
        if (!map.containsKey(name))return "no one";
        for (String key:map.keySet()){
            if (key.equals(name)){
                return map.get(key);
            }
        }
        return "";
    }
    public void printAllNames(){
        List<String> sortedList=new ArrayList<>(map.keySet());
        Collections.sort(sortedList);
        for (int counter=0;counter< sortedList.size();counter++){
            System.out.println(counter+1+".Name: "+sortedList.get(counter)+" - number: "+map.get(sortedList.get(counter)));
        }


    }


}
