package com.company.Interfaces.IMPS;

import com.company.Classes.Book;
import com.company.Interfaces.GenerateBook;

import java.util.ArrayList;
import java.util.List;

public class GenerateBookHelper implements GenerateBook {
    public GenerateBookHelper() {
    }

    @Override
    public List<Book> generateBooks() {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setBookName("Narnia");
        book1.setAuthor("Clive Staples Lewis");
        book1.setPageNumber(208);
        books.add(book1);

        Book book2 = new Book();
        book2.setBookName("Game of Thrones");
        book2.setAuthor("George R. R. Martin");
        book2.setPageNumber(768);
        books.add(book2);

        Book book3 = new Book();
        book3.setBookName("Thor: Ages of Thunder");
        book3.setAuthor("Matt Fraction");
        book3.setPageNumber(150);
        books.add(book3);

        Book book4 = new Book();
        book4.setBookName("The Mother");
        book4.setAuthor("Maksim Gorkiy");
        book4.setPageNumber(352);
        books.add(book4);

        Book book5 = new Book();
        book5.setBookName("Brief answers to the big questions");
        book5.setAuthor("Stephen Hawking");
        book5.setPageNumber(256);
        books.add(book5);

        Book book6 = new Book();
        book1.setBookName("Les Miserables");
        book1.setAuthor("Victor Hugo");
        books.add(book1);

        Book book7 = new Book();
        book3.setBookName("Murder on the Orient Express");
        book3.setAuthor("Agatha Christie");
        books.add(book3);

        Book book8 = new Book();
        book4.setBookName("The Hunchback of Notre Dame");
        book4.setAuthor("Victor Hugo");
        books.add(book4);

        Book book9 = new Book();
        book6.setBookName("Green Mile");
        book6.setAuthor("Stephen King");
        books.add(book6);

        Book book10 = new Book();
        book7.setBookName("To kill a mockingbird");
        book7.setAuthor("Harper Lee");
        books.add(book7);

        Book book11 = new Book();
        book9.setBookName("The White Ship");
        book9.setAuthor("Chynghyz Aitmatov");
        books.add(book9);

        Book book12 = new Book();
        book10.setBookName("War and Peace");
        book10.setAuthor("Leo Tolstoy");
        books.add(book10);

        Book book13 = new Book();
        book11.setBookName("Romeo and Juliet");
        book11.setAuthor("William Shakespeare");
        books.add(book11);
        return books;
    }
}
