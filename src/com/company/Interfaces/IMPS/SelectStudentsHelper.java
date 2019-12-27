package com.company.Interfaces.IMPS;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.ForAdmin;
import com.company.Interfaces.GenerateStudent;
import com.company.Interfaces.SelectStudents;

import java.util.Scanner;

public class SelectStudentsHelper implements SelectStudents {
    @Override
    public void selectStudent(String name) {
        GenerateStudent sG = new GenerateStudentHelper();

        boolean numeric = true;
        numeric = name.matches("-?\\d+(\\.\\d+)?");
        if (numeric) {
            int a = Integer.parseInt(name);
            if (a-1 >= sG.generateStudent().size()) {
                System.out.println("!!!Please type number that see only!!!");
                Integer counter = 1;
                for (Student student: sG.generateStudent()) {
                    System.out.println("[" + counter + "]" + student.getFirstname()+ " "+ student.getLastName());
                    counter++;
                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("Select a student: ");
                String newAnswer = scanner.nextLine();
                SelectStudents selectStudents = new SelectStudentsHelper();
                selectStudents.selectStudent(newAnswer);

            }
            else {
                System.out.println(sG.generateStudent().get(a-1).getFirstname()+ " "+sG.generateStudent().get(a-1).getLastName()+"\n" +
                        "BOOKS THAT STUDENT HAS: ");
                int counter = 1;
                for (Book book: sG.generateStudent().get(a-1).getBooks()) {
                    System.out.println("[" + counter + "]" + book.getBookName());
                    counter++;
                }
                ForAdmin forAdmin = new ForAdminHelper();
                forAdmin.forAdmin();
            }
        }
        else {
            System.out.println("!!!Please type only number!!! ");
            Integer counter = 1;
            for (Student student: sG.generateStudent()) {
                System.out.println("[" + counter + "]"+ student.getFirstname() + " " + student.getLastName());
                counter++;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select a student");
            String newAnswer = scanner.nextLine();
            SelectStudents selectStudents = new SelectStudentsHelper();
            selectStudents.selectStudent(newAnswer);

        }
    }
}
