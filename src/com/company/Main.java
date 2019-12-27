package com.company;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.*;
import com.company.Interfaces.IMPS.*;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GenerateStudent generateStudent = new GenerateStudentHelper();
        List<Student>  students = generateStudent.generateStudent();

        Scanner scanner = new Scanner(System.in);
        System.out.println("ARE YOU STUDENT OR ADMIN?  ");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.equals("student")){
            ForStudent studentAnswers = new ForStudentHelper();
            studentAnswers.forStudent();
        }
        else if (answer.equals("admin")){
            ForAdmin forAdmin = new ForAdminHelper();
            forAdmin.forAdmin();
        }
        else if ((!answer.equals("student"))&&(!answer.equals("admin"))){
            ForFalseAnswer forFalseAnswer = new ForFalseAnswerHelper();
            forFalseAnswer.falseAnswer(answer);
        }
    }
}
