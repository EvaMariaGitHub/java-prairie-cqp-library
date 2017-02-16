package com.simplon;

/**
 * Created by alonso on 14/02/17.
 */
public class Dvd extends Numerique {
    private boolean is3D;
    protected enum Movie {HORROR, FUN, ACTION, MUSICAL};
    private Movie movie;

    public Dvd(String title, int time, Movie movie, boolean is3D) {
        super(title, time);
        this.movie = movie;
        this.is3D = is3D;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dvd dvd = (Dvd) o;

        if (is3D != dvd.is3D) return false;
        return movie == dvd.movie;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (is3D ? 1 : 0);
        result = 31 * result + (movie != null ? movie.hashCode() : 0);
        return result;
    }
}
