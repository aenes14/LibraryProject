package com.company.Interfaces.IMPS;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.SelectBook;
import com.company.Interfaces.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;

public class TakeOrGiveBookHelper implements TakeOrGiveBook {
    @Override
    public void takeOrGiveBook(String answer, List<Book> allbooks, List<Student> students) {
        if (answer.equals("1")) {
            if (allbooks.size()==0) {
                System.out.println("There is no book to take u dumb! Give me some of urs!!! ");
                Scanner scanner = new Scanner(System.in);
                System.out.println("R u gonna take or give a book? ");
                String newAns = scanner.nextLine();
               takeOrGiveBook(newAns, allbooks, students);
            }
            else {
                System.out.println("All books: ");
                Integer counter = 1;
                for (Book Book: allbooks) {
                    System.out.println("[" + counter + "]" + Book.getBookName() + " by " + Book.getAuthor() +
                            "\nPage number: " + Book.getPageNumber());
                    counter++;
                }
                Scanner newAnswer = new Scanner(System.in);
                System.out.println("Chose a book ");
                String ans = newAnswer.nextLine();
                SelectBook selectBook = new SelectBookHelper();
                selectBook.selectBook(ans, students, allbooks);
            }
        }
        if (answer.equals("2")) {
            if (students.get(students.size()-1).books.size()==0){
                System.out.println("you dont have any book");
                Scanner scanner = new Scanner(System.in);
                System.out.println("will you take a book or give a book");
                String newAnswer = scanner.nextLine();
                takeOrGiveBook(newAnswer,allbooks,students);
            }
            else{
                System.out.println("you have these books:");
                int counter = 1;
                for (Book book:students.get(students.size()-1).books){
                    System.out.println("["+counter+"] "+book.getBookName()+"\n");
                    counter++;
                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("Select a book to give: ");
                String newAnswer = scanner.nextLine();
            }
        }
        else {

        }
    }
}
