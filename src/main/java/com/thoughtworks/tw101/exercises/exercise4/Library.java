package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        boolean bookFound = false;
        System.out.print("\nBooks that match " + partialBookTitle+": ");
        for (String book: books){
            if (book.contains(partialBookTitle)) {
                System.out.print(book + ", ");
                bookFound = true;
            }
        }

        if(bookFound ==false)
            System.out.println("No matching books");
    }
}
