package com.simplon;

import java.util.ArrayList;

/**
 * Created by alonso on 17/03/17.
 */
public interface ILibrary {
    ArrayList putBooks(ArrayList books);
    ArrayList putDvds(ArrayList dvds);
    ArrayList putCDs(ArrayList cds);
    boolean isOpen(int hour);
}
