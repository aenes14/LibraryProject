package com.company.Interfaces.IMPS;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.ForStudent;
import com.company.Interfaces.GenerateBook;
import com.company.Interfaces.GenerateStudent;
import com.company.Interfaces.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;

public class ForStudentHelper implements ForStudent {
    @Override
    public void forStudent() {
        GenerateBook generateBooks = new GenerateBookHelper();
        List<Book> allBooks = generateBooks.generateBooks();
        GenerateStudent generateStudent = new GenerateStudentHelper();
        List<Student> studentList = generateStudent.generateStudent();

        Student student = new Student();

        Scanner infos = new Scanner(System.in);
        System.out.println("What's ur name? ");
        String name = infos.nextLine();
        student.setFirstname(name);
        System.out.println("What's ur surname? ");
        String surName = infos.nextLine();
        student.setLastName(surName);
        System.out.println("What's ur phone NO? ");
        String phoneNumber = infos.nextLine();
        student.setPhoneNumber(phoneNumber);
        studentList.add(student);





        Scanner scanner = new Scanner(System.in);
        System.out.println("R U GONNA TAKE A BOOK OR GIVE A BOOK?  " +
                "\n Press [1] to take a book " +
                "\n Press [2] to give a book");
        String answer = scanner.nextLine();
        TakeOrGiveBook takeOrGiveBook = new TakeOrGiveBookHelper();
        takeOrGiveBook.takeOrGiveBook(answer,allBooks,studentList);

    }
}
