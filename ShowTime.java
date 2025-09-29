package movieticketbookingsystem;

import java.time.LocalDateTime;

public class ShowTime {
    private Movie movie;
    private LocalDateTime time;
    private int seatsAvailable;

    public ShowTime(Movie movie, LocalDateTime time, int seatsAvailable) {
        this.movie = movie;
        this.time = time;
        this.seatsAvailable = seatsAvailable;
    }

    public Movie getMovie() { return movie; }
    public LocalDateTime getTime() { return time; }
    public int getSeatsAvailable() { return seatsAvailable; }

    public boolean bookSeats(int numberOfSeats) {
        if (numberOfSeats <= seatsAvailable) {
            seatsAvailable -= numberOfSeats;
            return true;
        }
        return false;
    }

    
    public String toString() {
        return movie.toString() + " at " + time + " | " + seatsAvailable + " seats left";
    }
}
