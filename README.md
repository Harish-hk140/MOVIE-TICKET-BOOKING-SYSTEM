# MOVIE-TICKET-BOOKING-SYSTEM
1. User Class

Attributes:

userId: Unique ID for each user.

name: Name of the user.

email: Email for communication and login.

password: Used for authentication.

Methods:

login(email, password): Verifies credentials and logs the user in.

logout(): Logs the user out.

Purpose: Represents customers who book movie tickets.

2. Admin Class

Inheritance: Extends the User class (Admin is a special type of user).

Methods:

addMovie(Movie movie): Adds new movies to the system.

removeMovie(int movieId): Removes movies from the system.

updateShowtime(Showtime showtime): Updates show timings and seat availability.

Purpose: Manages movies, showtimes, and overall system settings.

3. Movie Class

Attributes:

movieId: Unique movie ID.

title: Name of the movie.

genre: Genre like action, drama, etc.

duration: Duration in hours/minutes.

Methods:

getDetails(): Returns movie details like title, genre, and duration.

Purpose: Stores information about each movie in the system.

4. Showtime Class

Attributes:

showtimeId: Unique ID for each showtime.

movie: The movie object for which the showtime is scheduled.

date: Date of the show.

time: Time of the show.

availableSeats: Number of seats available.

Methods:

getShowtimeDetails(): Returns date, time, and seat details.

Purpose: Represents scheduled showtimes for movies.

5. Ticket Class

Attributes:

ticketId: Unique ID for the ticket.

showtime: Associated showtime object.

seatNumber: Seat assigned to the user.

price: Price of the ticket.

Methods:

generateTicket(): Returns a printable ticket with booking details.

Purpose: Stores details of booked tickets.

6. Booking Class

Attributes:

bookingId: Unique ID for each booking.

user: The user who made the booking.

ticket: The ticket booked for the showtime.

bookingDate: Date when the booking was made.

Methods:

makePayment(Payment payment): Handles the payment process.

Purpose: Manages bookings made by users.

7. Payment Class

Attributes:

paymentId: Unique ID for each payment.

amount: Total amount paid.

paymentDate: Date of payment.

Methods:

processPayment(): Processes payment for the booking.

Purpose: Stores and processes payment information.

Relationships in the Diagram

Admin --|> User: Admin inherits from User.

User "1" --> "many" Booking: A user can make many bookings.

Booking --> Ticket --> Showtime --> Movie: Shows the workflow from booking to movie details.

Booking --> Payment: Each booking has one associated payment.
