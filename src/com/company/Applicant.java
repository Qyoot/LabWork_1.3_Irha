package com.company;

public class Applicant implements IPerson{

    int age;
    String first_name;
    String last_name;


    public  Applicant(int age , String first_name, String last_name){
        this.age=age;
        this.first_name=first_name;
        this.last_name=last_name;

    }
}
