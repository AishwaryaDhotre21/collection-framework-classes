package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterfaceEx {
    public static void main(String ar[])
    {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(4,"D");
        map.put(3,"C");
        map.put(5,"E");

        System.out.println("\n\n1. Map Data:\n");
        map.entrySet().forEach(entry->{
            System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
        });

        System.out.println("\n\n2. Map Data:\n");
        Iterator<Map.Entry<Integer,String >>iterator =map.entrySet().stream().iterator();
        while (iterator.hasNext())
        {
           Map.Entry<Integer,String> entry=iterator.next();
           System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        System.out.println("\n\n3. Map Data:\n");
        map.entrySet().stream().forEach((entry)->{
            System.out.println(entry.getKey()+"  "+entry.getValue());
        });
        System.out.println("\n\n4. Map Data:\n");
        map.forEach((key,value)->{
            System.out.println(key+" "+value);
        });
        System.out.println("\n\n5. Map Data:\n");
        for (Iterator<Map.Entry<Integer,String>> iterator1=map.entrySet().iterator();iterator1.hasNext();)
        {
            Map.Entry<Integer,String>entry=iterator1.next();
            System.out.println("Key:"+entry.getKey()+"  Value:"+entry.getValue());
        }

        Iterator<Integer> iterator1=map.keySet().iterator();
        while (iterator1.hasNext())
        {
           System.out.println("Key :-"+iterator1.next());
        }
        Iterator<String> iterator2=map.values().iterator();
        while (iterator2.hasNext())
        {
            System.out.println(iterator2.next());
        }
        for (Map.Entry<Integer,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }
}
