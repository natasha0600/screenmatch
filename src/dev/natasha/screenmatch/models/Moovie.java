package dev.natasha.screenmatch.models;

import dev.natasha.screenmatch.calculations.Classification;

public class Moovie extends Title implements Classification {
   private String director;

    public Moovie(String name, int releaseYear) {
        super(name, releaseYear);

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) (averageRatings() / 2);
    }

    @Override
    public String toString() {
        return "Filme: "+this.getName() + " (" + this.getReleaseYear() + ")";
    }
}

