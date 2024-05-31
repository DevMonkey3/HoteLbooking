public class Admin extends User {

    public Admin(String username, String userID) {
        super(username, userID);
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin ID: " + getUserID());
        System.out.println("Admin Name: " + getUsername());
    }

    /// Admin-specific operations

    public void addRoom(HotelBookingSystem system, Room room) {
        system.addRoom(room);
        System.out.println("Room added: " + room.getRoomNumber());
    }

    public void removeRoom(HotelBookingSystem system, Room room) {
        system.removeRoom(room);
        System.out.println("Room removed: " + room.getRoomNumber());
    }

    public void updateRoomInfo(HotelBookingSystem system, Room room, RoomType newType) {
        room.setRoomType(newType);
        System.out.println("Room updated: " + room.getRoomNumber() + " to type " + newType);
    }

    public void viewAllRooms(HotelBookingSystem system) {
        for (Room room : system.allRooms()) {
            System.out.println("Room Number: " + room.getRoomNumber() + ", Type: " + room.getRoomType() + ", Booked: "
                    + room.isBooked());
        }
    }

    public void bookRoom(HotelBookingSystem system, Customer customer, Room room) {
        system.bookRoom(customer, room);
    }

    public void cancelBooking(HotelBookingSystem system, Customer customer, Room room) {
        system.cancelBooking(customer, room);
    }

    public void viewBookings(HotelBookingSystem system) {
        system.getAvaliableRoom();
    }

}
