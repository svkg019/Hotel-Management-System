import java.util.*;
public class HotelService {
    private final UserDAO userDAO;
    private final BookingDAO bookingDAO;

    public HotelService() {
        userDAO = new UserDAO();
        bookingDAO = new BookingDAO();
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



}