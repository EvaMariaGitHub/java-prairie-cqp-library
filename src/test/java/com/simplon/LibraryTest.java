package com.simplon;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.simplon.Cd;

import static org.junit.Assert.*;

/**
 * Created by alonso on 15/02/17.
 */
public class LibraryTest {
    @Test
    public void putBooks(){
        //set
        ArrayList<Book> books = new ArrayList<>();
        Book book = new Book("book1", 210);
        Book book1 = new Book("book2", 210);
        books.addAll(Arrays.asList(book, book1));
        Library library = new Library(books, new ArrayList<>(), new ArrayList<>());
        ArrayList<Book> newBooks = new ArrayList<>();
        Book newBook = new Book("newBbook", 210);
        newBooks.add(newBook);
        ArrayList<Book> booksResult = new ArrayList<>();
        booksResult.addAll(books);
        booksResult.addAll(newBooks);
        //test
        ArrayList<Book> result = library.putBooks(newBooks);
        //assert
        assertArrayEquals(booksResult.toArray(), result.toArray());
    }

    @Test
    public void putCds(){
        //set
        ArrayList<Cd> cds = new ArrayList<>();
        Cd cd = new Cd("cd1", 210);
        Cd cd1 = new Cd("cd2", 210);
        cds.addAll(Arrays.asList(cd, cd1));
        Library library = new Library(new ArrayList<>(), cds,  new ArrayList<>());
        ArrayList<Cd> newCds = new ArrayList<>();
        Cd newCd = new Cd("newCd", 210);
        newCds.add(newCd);
        ArrayList<Cd> cdsResult = new ArrayList<>();
        cdsResult.addAll(cds);
        cdsResult.addAll(newCds);
        //test
        ArrayList<Cd> result = library.putCds(newCds);
        //assert
        assertArrayEquals(cdsResult.toArray(), result.toArray());
    }

    @Test
    public void putDvds_With3(){
        //set
        ArrayList<Dvd> dvds = new ArrayList<>();
        Dvd dvd = new Dvd("dvd1", 210, Dvd.Movie.ACTION, true);
        Dvd dvd1 = new Dvd("dvd2", 210, Dvd.Movie.MUSICAL, false);
        dvds.addAll(Arrays.asList(dvd, dvd1));
        Library library = new Library(new ArrayList<>(), new ArrayList<>(), dvds);
        ArrayList<Dvd> newDvds = new ArrayList<>();
        Dvd newDvd = new Dvd("newDvd", 210, Dvd.Movie.FUN, true);
        newDvds.add(newDvd);
        ArrayList<Dvd> dvdsResult = new ArrayList<>();
        dvdsResult.addAll(dvds);
        dvdsResult.addAll(newDvds);
        //test
        ArrayList<Dvd> result = library.putDvds(newDvds);
        //assert
        assertArrayEquals(dvdsResult.toArray(), result.toArray());
    }

    @Test
    public void putDvds_WithDoublon(){
        //set
        ArrayList<Dvd> dvds = new ArrayList<>();
        Dvd dvd = new Dvd("dvd1", 210, Dvd.Movie.ACTION, true);
        Dvd dvd1 = new Dvd("dvd2", 210, Dvd.Movie.MUSICAL, false);
        dvds.addAll(Arrays.asList(dvd, dvd1));
        Library library = new Library(new ArrayList<>(), new ArrayList<>(), dvds);
        ArrayList<Dvd> newDvds = new ArrayList<>();
        Dvd newDvd = new Dvd("dvd2", 210, Dvd.Movie.MUSICAL, false);
        newDvds.add(newDvd);
        //test
        ArrayList<Dvd> result = library.putDvds(newDvds);
        //assert
        assertArrayEquals(dvds.toArray(), result.toArray());
    }

    @Test
    public void putDvds_With4(){
        //set
        ArrayList<Dvd> dvds = new ArrayList<>();
        Dvd dvd = new Dvd("dvd1", 210, Dvd.Movie.ACTION, true);
        Dvd dvd1 = new Dvd("dvd2", 210, Dvd.Movie.MUSICAL, false);
        Dvd dvd3 = new Dvd("dvd3", 210, Dvd.Movie.MUSICAL, false);
        dvds.addAll(Arrays.asList(dvd, dvd1));
        Library library = new Library(new ArrayList<>(), new ArrayList<>(), dvds);
        ArrayList<Dvd> newDvds = new ArrayList<>();
        Dvd newDvd = new Dvd("newDvd", 210, Dvd.Movie.MUSICAL, false);
        newDvds.add(newDvd);
        //test
        ArrayList<Dvd> result = library.putDvds(newDvds);
        //assert
        assertArrayEquals(dvds.toArray(), result.toArray());
    }



    @Test
    public void isOpenBetween1to7() {
        //Set
        Library library = new Library();
        int hour = 4;
        //test
        boolean result = library.isOpen(hour);
        //assert
        assertTrue(result);
    }

    @Test
    public void isOpenBefore1AndAfter7() {
        //Set
        Library library = new Library();
        int hour = 0;
        //test
        boolean result = library.isOpen(hour);
        //assert
        assertFalse(result);
    }







}