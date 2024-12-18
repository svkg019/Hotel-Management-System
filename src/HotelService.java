import java.util.*;
public class HotelService {
    private final UserDAO userDAO;

    public HotelService() {
        userDAO = new UserDAO();
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

}