package org.example;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Iterate using basic for loop:-\n\n");

        for (int i=0;i<studentList.size();i++)
        {
            System.out.println("ID:- "+studentList.get(i).id+"  Name:- "+studentList.get(i).name+"  Percentage:- "+studentList.get(i).percent);
        }
    }
}
