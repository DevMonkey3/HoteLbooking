import java.util.Date;

public class Booking {
    private Customer customer;
    private Room room;
    private Date bookingDate;

    public Booking(Customer customer, Room room, Date bookingDate) {
        this.customer = customer;
        this.room = room;
        this.bookingDate = bookingDate;
    }

    // Getter for customer
    public Customer getCustomer() {
        return customer;
    }

    // Setter for customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Getter for room
    public Room getRoom() {
        return room;
    }

    // Setter for room
    public void setRoom(Room room) {
        this.room = room;
    }

    // Getter for bookingDate
    public Date getBookingDate() {
        return bookingDate;
    }

    // Setter for bookingDate
    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

}
