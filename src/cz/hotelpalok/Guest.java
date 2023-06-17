package cz.hotelpalok;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Guest {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Guest(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDescription() {
        return firstName + " " + lastName + " (" + dateOfBirth.format(DateTimeFormatter.ofPattern("d.M.yyyy")) + ")";
    }
}