package com.access.packages;

public class BookInSamePackage {
    Book book=new Book();
   public void Bookrun()
    {
        book.priceAndPageDisplay();
        book.priceAndPageDisplay();
        book.displayTitle();
    }
}
