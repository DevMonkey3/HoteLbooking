import java.util.List;

public interface BookingSystem {
    void bookRoom(Customer customer, Room room);

    void cancelBooking(Customer customer, Room room);

    List<Room> getAvaliableRoom();

}
