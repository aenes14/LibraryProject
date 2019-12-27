package com.company.Interfaces.IMPS;

import com.company.Classes.Student;
import com.company.Interfaces.ForAdmin;
import com.company.Interfaces.ForFalseAnswer;
import com.company.Interfaces.ForStudent;
import com.company.Interfaces.GenerateStudent;

import java.util.List;
import java.util.Scanner;

public class ForFalseAnswerHelper implements ForFalseAnswer {
    @Override
    public void falseAnswer(String answer) {
        while ((!answer.equals("student"))&&(!answer.equals("admin"))) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("!!!Type only 'student' or 'admin' u dumb!!! ");
            String newAnswer = scanner1.nextLine().toLowerCase();
            falseAnswer(newAnswer);
            if (newAnswer.equals("student")) {
                ForStudent forStudent = new ForStudentHelper();
                forStudent.forStudent();
                break;
            }
            if (newAnswer.equals("admin")) {
                ForAdmin forAdmin = new ForAdminHelper();
                forAdmin.forAdmin();
                break;
            }
        }
    }
}
