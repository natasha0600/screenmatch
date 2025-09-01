package dev.natasha.screenmatch.models;

import com.google.gson.annotations.SerializedName;
import dev.natasha.screenmatch.exception.YearConversionErrorException;

public class Title implements Comparable <Title>{
    private String name;
    private int releaseYear;
    private boolean includedInThePlan;
    private double sumOfRatings;
    private int totalReviews;
    private int durationInMinutes;


    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(OmdbTitle myOmdbTitle) {
        this.name = myOmdbTitle.title();

        if(myOmdbTitle.year().length() > 4){
            throw new YearConversionErrorException("Não consegui converter o ano" +
                    " porque tem mais de 04 caracteres");
        }
        this.releaseYear = Integer.valueOf(myOmdbTitle.year());
        this.durationInMinutes = Integer.valueOf(myOmdbTitle.runtime().substring(0,2));
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public int getTotalReviews(){
        return totalReviews;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public double getSumOfRatings() {
        return sumOfRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void displayTechnicalSpecifications(){
        System.out.println("Moovie Name: "+name);
        System.out.println("Release Year: "+releaseYear);
        System.out.println("Duration in minutes: "+durationInMinutes);
    }
    public void ratings(double note){
        sumOfRatings += note;
        totalReviews++;
    }
    public double averageRatings(){
        return sumOfRatings / totalReviews;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "(name= " + name +
                ", releaseYear= " + releaseYear+", "+
                "duration= "+durationInMinutes+")";
    }
}
