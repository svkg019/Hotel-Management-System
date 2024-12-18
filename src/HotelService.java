import java.util.*;
public class HotelService {
    private final UserDAO userDAO;
    private final BookingDAO bookingDAO;
    private final RoomDAO roomDAO;

    public HotelService() {
        userDAO = new UserDAO();
        bookingDAO = new BookingDAO();
        roomDAO = new RoomDAO();
    }

    public void registerUser(User user) {
        userDAO.addUser(user);
    }
    public void updateUser(String userId, String email) {
        userDAO.updateUser(userId, email);
    }
    public void deleteUser(String userId) {
        userDAO.deleteUser(userId);
    }
    public void viewUsers() {
        List<User> users = userDAO.getAllUsers();
        for (User user : users) {
            System.out.println(user.getUserId() + " " + user.getFullName() + " " + user.getEmail() + " " + user.getPhoneNumber());
        }
    }
    public boolean userVerification(String userId, String password){
        List<User> users = userDAO.getAllUsers();
        for (User user : users) {
            if (user.getUserId().equalsIgnoreCase(userId) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    public boolean isAdmin(String userId){
        return userId.toLowerCase().contains("hotel.com");
    }


    public void viewBookingHistoryByID(String userId) {
        List<Booking> bookings = bookingDAO.getAllBookings();
        for (Booking booking : bookings) {
            if (booking.getCustomerId().equalsIgnoreCase(userId)) {
                System.out.println(booking.getBookingId() + " " + booking.getCheckInDate() + " " + booking.getCheckOutDate() + " " + booking.getRoomNumber());
            }
        }
    }

    public void viewBookingHistory() {
        List<Booking> bookings = bookingDAO.getAllBookings();
        for (Booking booking : bookings) {
            System.out.println(booking.getCustomerId() + " " + booking.getName() + " " + booking.getMobileNumber() + " " + booking.getEmail());
        }
    }

    Room r1 = new Room(119, "2BHK", "Kolkata", 2000, false, "19/12/24");
    Room r2 = new Room(101,"1BHK","Darjeeling",1000,false,"19/12/24");
    Room r3 = new Room(102,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r4 = new Room(103,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r5 = new Room(104,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r6 = new Room(105,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r7 = new Room(106,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r8 = new Room(107,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r9 = new Room(108,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r10 = new Room(109,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r11 = new Room(110,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r12 = new Room(111,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r13 = new Room(112,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r14 = new Room(113,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r15 = new Room(114,"2BHK","Kolkata",2000,false,"19/12/24");









}