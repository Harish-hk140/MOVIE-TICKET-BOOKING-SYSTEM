package movieticketbookingsystem;

public class Booking {
    private User user;
    private ShowTime showTime;
    private int seatsBooked;
    private int ticketPrice;

    public Booking(User user, ShowTime showTime, int seatsBooked, int ticketPrice) {
        this.user = user;
        this.showTime = showTime;
        this.seatsBooked = seatsBooked;
        this.ticketPrice = ticketPrice;
    }

    public int getTotalPrice() {
        return seatsBooked * ticketPrice;
    }

    @Override
    public String toString() {
        return "User: " + user.getUsername() + ", Show: " + showTime.toString()
                + ", Seats booked: " + seatsBooked + ", Total Price: $" + getTotalPrice();
    }
}
