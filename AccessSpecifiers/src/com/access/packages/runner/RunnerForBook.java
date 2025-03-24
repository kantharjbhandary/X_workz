package com.access.packages.runner;

import com.access.packages.Book;
import com.access.packages.BookInSamePackage;

public class RunnerForBook {
    public static void main(String[] args) {
        Book book = new Book();
        BookInSamePackage bookInSamePackage=new BookInSamePackage();
        book.displayTitle();
        //book.displayPages();
        book.priceAndPageDisplay();
        bookInSamePackage.Bookrun();

    }
}
