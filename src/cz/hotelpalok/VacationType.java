package cz.hotelpalok;

public enum VacationType {
    RECREATIONAL("Stay Type: Recreation"),
    WORKING("Stay Type: Work");
    private String description;

    VacationType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
