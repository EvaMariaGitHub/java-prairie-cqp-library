package com.simplon;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by alonso on 15/02/17.
 */
public class Library {

    private static final int MAX_DVD = 3;
    private static final int OUVERTURE = 1;
    private static final int FERMETURE = 7;
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Cd> cds = new ArrayList<>();
    private ArrayList<Dvd> dvds = new ArrayList<>();

    public Library (ArrayList<Book> books, ArrayList<Cd> cds, ArrayList<Dvd> dvds){
        this.books = books;
        this.cds = cds;
        this.dvds = dvds;
    }

    public Library (){
    }

    public ArrayList<Book> putBooks(ArrayList<Book> books) {
        this.books.addAll(books);
        return this.books;
    }

    public ArrayList<Cd> putCds(ArrayList<Cd> newCds) {
        this.cds.addAll(newCds);
        return this.cds;
    }

     public ArrayList<Dvd> putDvds(ArrayList<Dvd> newDvds) {
        if(this.dvds.size() + newDvds.size() <= MAX_DVD) {
            HashSet<Dvd> hashSetDvds = new HashSet<>(this.dvds);
            hashSetDvds.addAll(newDvds);
            if (hashSetDvds.size() == this.dvds.size() + newDvds.size()) {
                this.dvds.addAll(newDvds);
            }
        }
            return this.dvds;
    }

    public boolean isOpen(int hour) {
        return !(hour >= FERMETURE || hour < OUVERTURE);
    }
}