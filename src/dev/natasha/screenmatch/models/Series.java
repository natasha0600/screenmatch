package dev.natasha.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private int episodePerSeason;
    private boolean active;
    private int minutesPerEpisode;

    public Series(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodePerSeason() {
        return episodePerSeason;
    }

    public void setEpisodePerSeason(int episodePerSeason) {
        this.episodePerSeason = episodePerSeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }
    @Override
    public int getDurationInMinutes(){
        return seasons * episodePerSeason * minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Série: "+this.getName() + " ("+this.getReleaseYear()+")";
    }
}
