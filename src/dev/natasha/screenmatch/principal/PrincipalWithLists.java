package dev.natasha.screenmatch.principal;

import dev.natasha.screenmatch.models.Moovie;
import dev.natasha.screenmatch.models.Series;
import dev.natasha.screenmatch.models.Title;

import java.util.*;

public class PrincipalWithLists {
    public static void main(String[] args) {
        Moovie myMoovie = new Moovie("Interestelar",2014);
        myMoovie.ratings(9);

        Moovie otherMoovie = new Moovie("Avatar",2023);
        otherMoovie.ratings(6);

        var natashasMoovie = new Moovie("Como se fosse a primeira vez",1999);
        natashasMoovie.ratings(10);
        Series lost = new Series("Lost",2000);
        lost.ratings(8);

        List<Title> watchedList = new LinkedList<>();
        watchedList.add(natashasMoovie);
        watchedList.add(myMoovie);
        watchedList.add(otherMoovie);
        watchedList.add(lost);

        for (Title item: watchedList){
            System.out.println(item.getName());
            if(item instanceof Moovie moovie && moovie.getClassification() > 2){
                System.out.println("Classificação: "+moovie.getClassification());
            }
        }

        ArrayList<String> buscaPorArtista =new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Keanu Rives");
        buscaPorArtista.add("Daniel Hadcliff");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(watchedList);
        System.out.println(watchedList);

        System.out.println("ordenando por ano");
        watchedList.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println(watchedList);

    }
}
