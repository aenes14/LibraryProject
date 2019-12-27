package com.company.Classes;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstname;
    private String lastName;
    private String phoneNumber;

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> books = new ArrayList<>();

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




}
