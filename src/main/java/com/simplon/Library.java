package com.simplon;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by alonso on 15/02/17.
 */
public class Library implements ILibrary{

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

    @Override
    public ArrayList<Book> putBooks(ArrayList books) {
        this.books.addAll(books);
        return this.books;
    }

    @Override
    public ArrayList<Cd> putCDs(ArrayList newCds) {
        this.cds.addAll(newCds);
        return this.cds;
    }

    @Override
     public ArrayList<Dvd> putDvds(ArrayList newDvds) {
        if(this.dvds.size() + newDvds.size() <= MAX_DVD) {
            HashSet<Dvd> hashSetDvds = new HashSet<>(this.dvds);
            hashSetDvds.addAll(newDvds);
            if (hashSetDvds.size() == this.dvds.size() + newDvds.size()) {
                this.dvds.addAll(newDvds);
            }
        }
            return this.dvds;
    }

    @Override
    public boolean isOpen(int hour) {
        return !(hour >= FERMETURE || hour < OUVERTURE);
    }
}