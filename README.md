# java-prairie-cqp - Library


A Book has a title and pages.
A CD has a title and a time.
A DVD has a kind, a title, an indication of it is in 3D and time.
There are 4 kind of movie: horror, fun, action, musical.

The Library must have these methods only:

    ArrayList putBooks(ArrayList books);
    ArrayList putDvds(ArrayList dvds);
    ArrayList putCDs(ArrayList cds);
    boolean isOpen(int hour);

The Library can put a lot of books and cds. It's open between 1pm and 7pm.
The Library can storage 3 DVDs only.
If there are already 3 DVDs and the user want to give more. The library doesn't accept these dvds.
If there are already some DVDs and the user try to give a dvd that the library already has. The library doesn't accept these dvds.

For example:
The library has 2 DVDs and the user give 4 DVDs. The library doesn't accept it. So the library has 3 DVD.
The library have 1 DVD like DVD dvd = new DVD("dvd", 120, Movie.HORROR, false) and the user give the same DVD. The library doesn't accept it.

Implement library and create unit test
