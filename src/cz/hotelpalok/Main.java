package cz.hotelpalok;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Vytvoření hostů
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        // Vypsání informací o hostech
        System.out.println(guest1.getDescription());
        System.out.println(guest2.getDescription());

        // Vytvoření pokojů
        Room room1 = new Room(1, 1, true, true, new BigDecimal("1000"));
        Room room2 = new Room(2, 1, true, true, new BigDecimal("1000"));
        Room room3 = new Room(3, 3, false, true, new BigDecimal("2400"));

        // Vypsání informací o pokojích
        System.out.println(room1.getDescription());
        System.out.println(room2.getDescription());
        System.out.println(room3.getDescription());

        // Vytvoření rezervací
        List<Guest> guests1 = new ArrayList<>();
        guests1.add(guest1);
        Booking booking1 = new Booking(room1, guests1, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), "rekreační");

        List<Guest> guests2 = new ArrayList<>();
        guests2.add(guest1);
        guests2.add(guest2);
        Booking booking2 = new Booking(room3, guests2, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), "rekreační");

        // Vytvoření instance rezervačního systému
        ListOfBookings listOfBookings = new ListOfBookings();

        // Přidání rezervací do systému
        listOfBookings.addBooking(booking1);
        listOfBookings.addBooking(booking2);

        // Vypsání všech rezervací
        listOfBookings.printAllBookings();
    }
}