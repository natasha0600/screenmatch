package dev.natasha.screenmatch.calculations;

import dev.natasha.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void includes(Moovie m){
//        this.totalTime += m.getDurationInMinutes();
//    }
//    public void includes(Series s){
//        this.totalTime += s.getDurationInMinutes();
//    }
    public void includes(Title title){
        System.out.println("Adicionando duração em minutos de: "+title);
        this.totalTime += title.getDurationInMinutes();
    }
}
