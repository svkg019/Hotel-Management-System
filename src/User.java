public class User {
    private int userId;
    private String fullName;
    private String email;
    private int phoneNumber;
    private String password;

    public User(int userId, String fullName, String email, int phoneNumber, String password) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}
