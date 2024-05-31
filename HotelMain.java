import java.util.*;

public class HotelMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HotelBookingSystem system = new HotelBookingSystem();
        Admin admin = new Admin("Adam", "011");

        while (true) {
            System.out.println("Welcome Admin! Choose an option:");
            System.out.println("1. Add Room");
            System.out.println("2. Remove Room");
            System.out.println("3. Update Room type");
            System.out.println("4. View Rooms");
            System.out.println("5. Book Room for Customer");
            System.out.println("6. Cancel Booking");
            System.out.println("7. View Bookings");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter new Room Number: ");
                    String roomnum = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println();
                    System.out.print("Enter new Room Type(single, double, SUITE): ");
                    RoomType type = RoomType.valueOf(scanner.nextLine().toUpperCase());
                    Room Newroom = new Room(roomnum, type);
                    admin.addRoom(system, Newroom);
                    break;
                case 2:
                    System.out.print("Enter new Room Number: ");
                    String removeRoomnum = scanner.nextLine();
                    Room removeroom = new Room(removeRoomnum, null);
                    admin.removeRoom(system, removeroom);
                    break;
                case 3:
                    System.out.print("Enter new Room Number: ");
                    String Updateroomnum = scanner.nextLine();
                    System.out.print("Enter new Room Type(single, double, SUITE): ");
                    RoomType Updatetype = RoomType.valueOf(scanner.nextLine().toUpperCase());
                    Room updateRoom = new Room(Updateroomnum, Updatetype);
                    admin.updateRoomInfo(system, updateRoom, Updatetype);
                    break;
                case 4:
                    admin.viewAllRooms(system);
                    break;
                case 5:
                    System.out.print("Enter customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter customer contact info: ");
                    String contactInfo = scanner.nextLine();
                    Customer customer = new Customer(customerId, customerName, contactInfo);

                    System.out.print("Enter room number to book: ");
                    String bookRoomNumber = scanner.nextLine();
                    Room bookRoom = new Room(bookRoomNumber, null); // Temporary room object for booking
                    admin.bookRoom(system, customer, bookRoom);
                    break;
                case 6:
                    System.out.print("Enter customer ID: ");
                    String cancelCustomerId = scanner.nextLine();
                    System.out.print("Enter room number to cancel booking: ");
                    String cancelRoomNumber = scanner.nextLine();
                    Room cancelRoom = new Room(cancelRoomNumber, null); // Temporary room object for cancellation
                    Customer cancelCustomer = new Customer(cancelCustomerId, "", ""); // Temporary customer object for
                                                                                      // cancellation
                    admin.cancelBooking(system, cancelCustomer, cancelRoom);
                    break;
                case 7:
                    admin.viewBookings(system);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 8.");
                    break;

            }

        }

    }
}
