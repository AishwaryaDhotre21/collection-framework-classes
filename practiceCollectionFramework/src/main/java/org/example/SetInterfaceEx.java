package org.example;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetInterfaceEx {
    public static void main(String args[])
    {
        //HashSet Example
        System.out.println("\n\nHashSet example: \n\n");
        Set<Integer> hashSet=new HashSet<>(Arrays.asList(1,3,4,1,2,8,9,4,2,5,6));
        System.out.println("\n\n1. HashSet Example: \n\n");
        System.out.println("HashSet:-"+hashSet);
        System.out.println("\n\n2. HashSet Example: \n\n");
        for (Integer i:hashSet)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n\n3. HashSet Example: \n\n");
        Iterator<Integer> iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println("\n\n4. HashSet Example: \n\n");
        for (Iterator iterator1=hashSet.iterator();iterator1.hasNext();)
        {
            System.out.print(iterator1.next()+" ");
        }
        System.out.println("\n\n5. HashSet Example: \n\n");
        hashSet.forEach(e->{
            System.out.print(e+" ");
        });
        System.out.println("\n\n6. HashSet Example: \n\n");
        hashSet.stream().map(e->{e.toString(); return e;}).forEach(e->{System.out.print(e+" ");});

        //LinkedSet
        Set<Object> set=new LinkedHashSet<>(hashSet);
        System.out.println("\n\nLinkedHashSet:-"+set);

        //CopyOnWriteArraySet
        System.out.println("\n\n CopyOnWriteArraySet:-\n");
        Set<Integer> set1=new CopyOnWriteArraySet(hashSet);
        set1.stream().forEach(e->{
            if(e.equals(3))
            {
                set1.add(e+10);
            }
            System.out.print(e+" ");
        });
        System.out.println("\n\nData in Set after concurrent modification:-"+set1);

    }

}
