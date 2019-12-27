package com.company.Interfaces.IMPS;

import com.company.Classes.Student;
import com.company.Interfaces.ForAdmin;
import com.company.Interfaces.ForStudent;
import com.company.Interfaces.GenerateStudent;
import com.company.Interfaces.SelectStudents;

import java.util.List;
import java.util.Scanner;

public class ForAdminHelper implements ForAdmin {
    @Override
    public void forAdmin() {
        GenerateStudent generateStudent = new GenerateStudentHelper();
        List<Student> students = generateStudent.generateStudent();
        System.out.println("All studnets: ");
        Integer counter = 1;
        for (Student allStudent: students) {
            System.out.println("[" + counter + "]" + allStudent.getFirstname() + " " + allStudent.getLastName() + "\n" +
                    "Phone NO: " + allStudent.getPhoneNumber());
            counter++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a student");
        SelectStudents takeStudent = new SelectStudentsHelper();
        String studentNumber = scanner.nextLine();
        takeStudent.selectStudent(studentNumber);
    }
}
