package com.company;
import java.util.Scanner;

public class Teacher implements IPerson {
    int age;
    String first_name;
    String last_name;
    int work_exp;
    Exams exams = new Exams();

    public Exams getExams() {
        return exams;
    }

    public void setExams() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter History grade: ");
        var grade = in.nextInt();
        exams.setHistory(grade);
        System.out.println("Enter Math grade: ");
        grade = in.nextInt();
        exams.setMathematics(grade);
        System.out.println("Enter Ukrainian grade: ");
        grade = in.nextInt();
        exams.setUkrainian(grade);
        System.out.println("Enter Professional Lang grade: ");
        grade = in.nextInt();
        exams.setProfessional_Lang(grade);
    }

    public Teacher(int age, String first_name, String last_name, int work_exp) {
        this.age=age;
        this.first_name=first_name;
        this.last_name=last_name;
        this.work_exp=work_exp;
    }
}
