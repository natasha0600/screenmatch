package dev.natasha.screenmatch.principal;

import dev.natasha.screenmatch.calculations.RecommendationFilter;
import dev.natasha.screenmatch.models.Episode;
import dev.natasha.screenmatch.models.Moovie;
import dev.natasha.screenmatch.models.Series;
import dev.natasha.screenmatch.calculations.TimeCalculator;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Moovie myMoovie = new Moovie("Interestelar",2014);

        myMoovie.setDurationInMinutes(180);
        myMoovie.setIncludedInThePlan(true);
        System.out.println("Duração do filme: "+myMoovie.getDurationInMinutes());
        myMoovie.displayTechnicalSpecifications();
        myMoovie.ratings(8);
        myMoovie.ratings(5);
        myMoovie.ratings(10);
        System.out.println("Total de reviews: "+myMoovie.getTotalReviews());
        System.out.println(myMoovie.averageRatings());

        Series lost = new Series("Lost",2000);
        lost.setSeasons(8);
        lost.setEpisodePerSeason(10);
        lost.setActive(true);
        lost.setMinutesPerEpisode(50);
        lost.displayTechnicalSpecifications();

        System.out.println("Para maratonar Lost: "+lost.getDurationInMinutes());

        Moovie otherMoovie = new Moovie("Avatar",2023);

        otherMoovie.setDurationInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMoovie);
        calculator.includes(otherMoovie);
        calculator.includes(lost);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filters(myMoovie);

        Episode ep = new Episode();
        ep.setNumber(1);
        ep.setSeries(lost);
        ep.setTotalViews(300);
        filter.filters(ep);

        var natashasMoovie = new Moovie("Como se fosse a primeira vez",1999);
        natashasMoovie.setDurationInMinutes(200);
        natashasMoovie.ratings(10);

        ArrayList<Moovie> moovieList = new ArrayList<>();
        moovieList.add(natashasMoovie);
        moovieList.add(myMoovie);
        moovieList.add(otherMoovie);
        System.out.println("Tamanho da lista: "+ moovieList.size());
        System.out.println("Primeiro filme: "+moovieList.get(0).toString());
        System.out.println("Lista de filmes: "+moovieList);

        Object objeto = natashasMoovie;



    }
}
