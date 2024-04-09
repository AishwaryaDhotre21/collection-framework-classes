package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
    import java.util.concurrent.CopyOnWriteArrayList;

class Student{
     int id;
     String name;
     Float percent;
    Student(int id,String name,Float percent)
    {
        this.id=id;
        this.name=name;
        this.percent=percent;
    }
}
public class ListInterfaceEx {
    public static void main(String args[])
    {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1,"Aishu",99.99F));
        studentList.add(new Student(2,"Leela",93.2F));
        studentList.add(new Student(3,"Ram",94.99F));
        studentList.add(new Student(4,"Sonu",91.99F));
        studentList.add(new Student(5,"Meena",97.99F));
        System.out.println("1: Iterate using basic for loop:-\n\n");

        for (int i=0;i<studentList.size();i++)
        {
            System.out.println("ID:- "+studentList.get(i).id+"  Name:- "+studentList.get(i).name+"  Percentage:- "+studentList.get(i).percent);
        }
        Iterator<Student> iterator=studentList.iterator();
        System.out.println("\n\n2: Iterate using Iterator:\n\n");
        while (iterator.hasNext())
        {   Student student=iterator.next();
            System.out.println("ID:- "+student.id
            +"  Name:- "+student.name+" Percentage:- "+student.percent);
        }
        System.out.println("\n\n3: For loop to iterate over List:\n\n");
        for(Student student:studentList)
        {
            System.out.println(student.id+"  "+student.name+"  "+student.percent);
        }
        System.out.println("\n\n4: For Each loop of stream API:-\n\n");
        studentList.stream().forEach(student -> {
            System.out.println(student.id+"  "+student.name+"  "+student.percent);
        });
        System.out.println("\n\n5: For each loop of List interface");
        studentList.forEach(student -> {
            System.out.println(student.id+"  "+student.name+"  "+student.percent);
        });
        System.out.println("\n\n6: For loop iterator interface:\n\n");
        for (Iterator<Student> iterator1=studentList.iterator();iterator1.hasNext();)
        {
            Student student=iterator1.next();
         //   studentList.add(new Student(6,"Meena",97.99F));
          /*  Exception in thread "main" java.util.ConcurrentModificationException
            at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)*/
            System.out.println(student.id+"  "+student.name+"  "+student.percent);
        }

        System.out.println("\n\nCopyOnWriteArrayList to support ThreadSafe ArrayList\n\n");
        List<Student> studentList1=new CopyOnWriteArrayList<Student>();
        studentList1.add(new Student(1,"Aishu",99.99F));
        studentList1.add(new Student(2,"Leela",93.2F));
        studentList1.add(new Student(3,"Ram",94.99F));
        studentList1.add(new Student(4,"Sonu",91.99F));
        studentList1.add(new Student(5,"Meena",97.99F));
        studentList1.forEach(student -> {
            if(student.id >= 5)
            {
                studentList1.add(new Student(6,"Teena",90.99F));
            }
            System.out.println(student.id+"  "+student.name+"  "+student.percent);
        });
        System.out.println("\n\nAfter insertion ArrayList:-\n\n");
        studentList1.stream().forEach(student -> {
            System.out.println(student.id+"  "+student.name+"  "+student.percent);
        });
    }
}
