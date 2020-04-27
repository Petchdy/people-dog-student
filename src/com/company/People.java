package com.company;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class People {
    String name;
    boolean sex;
    int age;
    String nationality;

    public People(String name,Boolean sex,int age,String nationality){
        this.name = name;
        sex = true;
        age = 25;
    }

    public void  introduce(){
        System.out.println("I'm "+name);
    }

    public String calculationAge(int age){
        if (this.age==age){
            return "we are same age";
        }
        else if (this.age>age){
            return "I'm older than you";
        }
        else if (this.age<age){
            return "I'm younger than you";
        }
        else {
            return null ;
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean getsex(){
        return this.sex;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }


}
