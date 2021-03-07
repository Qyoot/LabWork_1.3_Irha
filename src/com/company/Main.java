package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Applicant applicant = new Applicant(19,"Steve","Brooks");
        // Teacher teacher = new Teacher(39,"Nike","Borzov",8);
        // Faculty faculty = new Faculty(applicant,teacher);

        System.out.println("Enter applicant age: ");
        int age  =  in.nextInt();
        System.out.println("Enter applicant First Name: ");
        var first_Name = reader.readLine();
        System.out.println("Enter applicant Last Name: ");
        var last_Name = reader.readLine();

        Applicant applicant = new Applicant(age,first_Name,last_Name);

        System.out.println("Enter teacher age: ");
         age  =  in.nextInt();
        System.out.println("Enter teacher First Name: ");
         first_Name = reader.readLine();
        System.out.println("Enter teacher Last Name: ");
         last_Name = reader.readLine();
        System.out.println("Enter teacher experience: ");
          var exp  =  in.nextInt();

        Teacher teacher = new Teacher(age,first_Name,last_Name,exp);
        Faculty faculty = new Faculty(applicant,teacher);




        System.out.println("Teacher:\nFirst Name: "+ teacher.first_name
                            +"\nLast name: " + teacher.last_name
                            +"\nAge: " + teacher.age
                            +"\nExperience: " + teacher.work_exp);
        System.out.println("");
        System.out.println("Applicant:\nFirst Name: " + applicant.first_name
                            +"\nLast Name: "+ applicant.last_name
                            +"\nAge: " + applicant.age);

        System.out.println("Avg Mark: " + faculty.ExamsResult());

    }
}
