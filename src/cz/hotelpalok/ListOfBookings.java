package cz.hotelpalok;
import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Booking> bookings;

    public ListOfBookings() {
        bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void printAllBookings() {
        for (Booking booking : bookings) {
            System.out.println("Booking Information:");
            System.out.println("Room: " + booking.getRoom().getDescription());
            System.out.println("Guests:");
            for (Guest guest : booking.getGuests()) {
                System.out.println("- " + guest.getDescription());
            }
            System.out.println("Start Date: " + booking.getStartDate().toString());
            System.out.println("End Date: " + booking.getEndDate().toString());
            System.out.println("Type of Vacation: " + booking.getVacationType());
            System.out.println();
        }
    }
}
