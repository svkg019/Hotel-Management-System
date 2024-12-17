import java.util.List;
import java.util.ArrayList;

public class UserDAO {
    private List<User> userList = new ArrayList<User>();
    //private int currentId = 1;

    public List<User> getAllUsers() {
        return userList;
    }

    public void addUser(User user) {
        //user.setUserId(currentId++);
        userList.add(user);
    }

    public void updateUser(String userId, String email) {
        for (User user : userList) {
            if (user.getEmail().equalsIgnoreCase(userId)) {
                user.setEmail(email);
                System.out.println("User details are updated successfully");
                return;
            }
        }
        System.out.println("User not found");
    }

    public void deleteUser(String userId) {
        for (User user : userList) {
            if (user.getUserId().equalsIgnoreCase(userId)) {
                userList.remove(user);
                System.out.println("User details are deleted");
                return;
            }
        }
        System.out.println("User not found");
    }
}
