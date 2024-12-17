import java.util.*;
public class HotelService {
    private final UserDAO userDAO;

    public HotelService() {
        userDAO = new UserDAO();
    }

    public void registerUser(User user) {
        userDAO.addUser(user);
    }
    public void updateUser(int userId, String email) {
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

}