package com.company;

public class student {
     int id;
     String name;
     String sex;
     float gpa;
     int room;
     String[] subject;

    public student(int id, String name, String sex, float gpa) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.gpa = gpa;
        manageRoom();
    }

    private void manageRoom() {
        if (this.gpa >= 3.5) {
            this.room = 1;
        } else if (this.gpa >= 3 && this.gpa < 3.49) {
            this.room = 2;
        } else if(this.gpa < 3){
            this.room = 3;
        }
    }

    public float Exam(int score){
        if (score > 80) {
            return gpa = 4;
        } else if (score >= 75) {
            return gpa = (float) 3.5;
        } else if (score >= 70) {
            return gpa = 3;
        } else if (score >= 65) {
            return gpa = (float) 2.5;
        } else if (score >= 60) {
            return gpa = 2;
        } else if (score >= 55) {
            return gpa = (float) 1.5;
        } else if (score >= 50) {
            return gpa = 1;
        } else {
            return gpa = 0;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public float getGpa() {
        return gpa;
    }

    public int getRoom() {
        return room;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printInfo(){

        System.out.printf("ID : %d Name : %s\n",id,name);
        System.out.printf("GPA : %.2f\n",gpa);
        System.out.printf("Room : %d\n",room);
        if (room==1){
            System.out.printf("Subject : Science Math\n");
        }
        else if (room==2){
            System.out.printf("Subject : Math English\n");
        }
        else if (room==3){
            System.out.printf("Subject : English Thai\n");
        }
    }
}
