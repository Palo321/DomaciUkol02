package cz.hotelpalok;
import java.time.LocalDate;
import java.util.List;

class Booking {
        private Room room;
        private List<Guest> guests;
        private LocalDate startDate;
        private LocalDate endDate;
        private String vacationType;
        public Booking() {
                LocalDate today = LocalDate.now();
                startDate = today;
                endDate = today.plusDays(6);
        }
        public Booking(Room room, List<Guest> guests, LocalDate startDate, LocalDate endDate, String vacationType) {
                this.room = room;
                this.guests = guests;
                this.startDate = startDate;
                this.endDate = endDate;
                this.vacationType = vacationType;
        }

        public Room getRoom() {
                return room;
        }

        public List<Guest> getGuests() {
                return guests;
        }

        public LocalDate getStartDate() {
                return startDate;
        }

        public LocalDate getEndDate() {
                return endDate;
        }

        public String getVacationType() {
                return vacationType;
        }
}
