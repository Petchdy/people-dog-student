package com.company;

import com.sun.xml.internal.ws.wsdl.writer.document.Fault;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        student std = new student(scan.nextInt(),scan.next(),scan.next(),scan.nextFloat());
        std.printInfo();
        std.Exam(scan.nextInt());
        std.printInfo();



        //Dog dog1 = new Dog(scan.next(),scan.next(),scan.next());
        //Dog dog2 = new Dog(scan.next(),scan.next(),scan.nextBoolean(),scan.next());
        //Dog dog3 = new Dog(scan.next(),scan.next(),scan.nextBoolean(),scan.nextInt(),scan.next());


        //People people = new People("Prayuth",true,66,"thai");

        //Dog d1 = new Dog();
        //d1.name = "Sonic";
        //d1.breed = "Shiba Inu";
        //d1.sex = true;
        //d1.age = 3;

        //Dog d2 = new Dog();
        //d2.name = "Husky";
        //d2.breed = "Husky";
        //d2.breed = d2.breed.trim();
        //d2.sex = false;
        //d2.age = 1;

        //Dog d3 = new Dog();
        //d3.name = scan.nextLine();
        //d3.breed = scan.next();
        //d3.breed = d3.breed.trim();
        //d3.sex = scan.nextBoolean();
        //d3.age = scan.nextInt();

        //d1.introduce();
        //d2.introduce();
        //d3.introduce();

        //System.out.println(d2.sameBreed(scan.nextLine()));

        }
}
