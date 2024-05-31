public class Room {
    private String RoomNumber;
    private RoomType roomType;
    private boolean isBooked;

    public Room(String RoomNumber, RoomType roomType, boolean isBooked) {
        this.RoomNumber = RoomNumber;
        this.roomType = roomType;
        this.isBooked = isBooked;
    }

    public Room(String RoomNumber, RoomType roomType) {
        this.RoomNumber = RoomNumber;
        this.roomType = roomType;

    }

    // Getter for roomNumber
    public String getRoomNumber() {
        return RoomNumber;
    }

    // Setter for roomNumber
    public void setRoomNumber(String RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    // Getter for roomType
    public RoomType getRoomType() {
        return roomType;
    }

    // Setter for roomType
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    // Getter for isBooked
    public boolean isBooked() {
        return isBooked;
    }

    // Setter for isBooked
    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

}
