package movieticketbookingsystem;

public class Movie {
    private String name;
    private String genre;
    private int duration;

    public Movie(String name, String genre, int duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }
    public String getName() { return name; }
    public String getGenre() { return genre; }
    public int getDuration() { return duration; }

    
    public String toString() {
        return name + " (" + genre + ", " + duration + " min)";
    }
}
