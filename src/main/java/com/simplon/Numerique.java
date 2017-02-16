package com.simplon;

/**
 * Created by alonso on 14/02/17.
 */
public class Numerique extends Media {
    private int time;

    public Numerique (String title, int time) {
        super(title);
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Numerique numerique = (Numerique) o;
        return time == numerique.time;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + time;
        return result;
    }
}
