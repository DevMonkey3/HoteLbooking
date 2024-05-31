import java.util.*;

public class HotelBookingSystem implements BookingSystem {
    private List<Room> rooms;
    private Map<String, Booking> bookings;

    public HotelBookingSystem() {
        this.rooms = new ArrayList<Room>();
        this.bookings = new HashMap<>();
    }

    @Override
    public void bookRoom(Customer customer, Room room) {
        if (!room.isBooked()) {
            room.setBooked(true);
            Booking book = new Booking(customer, room, new Date());
            bookings.put(generateBookingKey(customer, room), book);
            System.out.println(
                    "Room " + room.getRoomNumber() + " booked successfully for customer " + customer.getUsername());
        } else {
            System.out.println("Room " + room.getRoomNumber() + " is already booked.");
        }

    }

    @Override
    public void cancelBooking(Customer customer, Room room) {
        String key = generateBookingKey(customer, room);
        if (bookings.containsKey(key)) {
            bookings.remove(key);
            room.setBooked(false);
            System.out.println("Booking for room " + room.getRoomNumber() + " cancelled successfully.");
        } else {
            System.out.println(
                    "No booking found for room " + room.getRoomNumber() + " by customer " + customer.getUsername());
        }

    }

    @Override
    public List<Room> getAvaliableRoom() {
        List<Room> AvaliableRoom = new ArrayList<Room>();
        for (Room room : rooms) {
            if (!room.isBooked()) {
                AvaliableRoom.add(room);

            }

        }
        return AvaliableRoom;

    }

    public List<Room> allRooms() {
        return rooms;

    }

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room added: " + room.getRoomNumber());

    }

    public void removeRoom(Room room) {
        if (!room.isBooked()) {
            rooms.remove(room);
            System.out.println("Room removed: " + room.getRoomNumber());

        } else {
            System.out.println("Cannot remove room " + room.getRoomNumber() + " because it is currently booked.");
        }
    }

    public String generateBookingKey(Customer customer, Room room) {
        return customer.getUserID() + " -" + room.getRoomType();
    }

    // Display all bookings
    public void displayDetails() {
        for (Booking booking : bookings.values()) {
            System.out.println("Booking: " + booking.getCustomer().getUsername() + " - "
                    + booking.getRoom().getRoomNumber() + " on " + booking.getBookingDate());
        }
    }

}
