package com.company.Interfaces.IMPS;

import com.company.Classes.Student;
import com.company.Interfaces.GenerateBook;
import com.company.Interfaces.GenerateStudent;

import java.util.ArrayList;
import java.util.List;

public class GenerateStudentHelper implements GenerateStudent {
    @Override
    public List<Student> generateStudent() {
        List<Student> students = new ArrayList<>();

        GenerateBook generateBook = new GenerateBookHelper();


        Student student1 = new Student();
        student1.setFirstname("Ahmet");
        student1.setLastName("Kozal");
        student1.setPhoneNumber("571");
        student1.books.add(generateBook.generateBooks().get(1));
        students.add(student1);


        Student student2 = new Student();
        student2.setFirstname("Timur");
        student2.setLastName("Agay");
        student2.setPhoneNumber("+996134");
        student2.books.add(generateBook.generateBooks().get(2));
        students.add(student2);

        Student student3 = new Student();
        student3.setFirstname("Hamza");
        student3.setLastName("Akkara");
        student3.setPhoneNumber("27062000");
        student3.books.add(generateBook.generateBooks().get(5));
        students.add(student3);


        Student student4 = new Student();
        student4.setFirstname("Ihsan");
        student4.setLastName("Gokalp");
        student4.setPhoneNumber("1254");
        student3.books.add(generateBook.generateBooks().get(11));
        students.add(student4);

        Student student5 = new Student();
        student5.setFirstname("Damian");
        student5.setLastName("Lillard");
        student5.setPhoneNumber("0");
        student3.books.add(generateBook.generateBooks().get(6));
        students.add(student5);
        return students;
    }
}
