package cz.hotelpalok;
import java.math.BigDecimal;


class Room {
    private int number;
    private int capacity;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private BigDecimal pricePerNight;

    public Room(int number, int capacity, boolean hasBalcony, boolean hasSeaView, BigDecimal pricePerNight) {
        this.number = number;
        this.capacity = capacity;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.pricePerNight = pricePerNight;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean hasBalcony() {
        return hasBalcony;
    }

    public boolean hasSeaView() {
        return hasSeaView;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public String getDescription() {
        return "Room " + number + " - Capacity: " + capacity + " - Balcony: " + (hasBalcony ? "Yes" : "No")
                + " - Sea View: " + (hasSeaView ? "Yes" : "No") + " - Price/Night: " + pricePerNight + " Kč";
    }
}