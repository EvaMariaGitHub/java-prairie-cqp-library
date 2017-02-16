package com.simplon;

/**
 * Created by alonso on 14/02/17.
 */
public class Book extends Media {
    private int page;

    public Book(String title, int page){
        super(title);
        this.page = page;
    }
}
