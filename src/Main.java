import java.util.*;

class Main{
    private static HotelService hotelService = new HotelService();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("+++++Hotel Management System+++++");
            System.out.println("1. User Management");
            System.out.println("2. Log-in");
            switch (sc.nextInt()) {
                case 1:
                    boolean flag = true;
                    do{
                        System.out.println("1. Register new user");
                        System.out.println("2. Update user");
                        System.out.println("3. Delete user");
                        System.out.println("4. View users");
                        System.out.println("5. Go back");
                        switch (sc.nextInt()) {
                            case 1:
                                registerNewUser();
                                break;
                            case 2:
                                updateUser();
                                break;
                            case 3:
                                deleteUser();
                                break;
                            case 4:
                                viewUsers();
                                break;
                            case 5:
                                flag = false;
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                    }while(flag);
                    break;
                case 2:
                    System.out.println("*****Log-in Menu*****");

                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }


        }while(true);

    }

public static void registerNewUser() {
    System.out.println("Enter your preferred UserId: ");
    String userId = sc.next(); sc.nextLine();
    System.out.println("Enter your full name: ");
    String name = sc.nextLine();
    System.out.println("Enter your email: ");
    String email = sc.nextLine();
    System.out.println("Enter your phone number: ");
    String phone = sc.nextLine();
    System.out.println("Enter your preferred password: ");
    String password = sc.nextLine();

    User user = new User(userId, name, email, phone, password);
    hotelService.registerUser(user);
    System.out.println("User registered successfully");
}

public static void updateUser() {
    System.out.println("Enter the userId: ");
    String userId = sc.next(); sc.nextLine();
    System.out.println("Enter the new email: ");
    String email = sc.next();
    hotelService.updateUser(userId, email);
}

public static void deleteUser() {
    System.out.println("Enter the userId: ");
    String userId = sc.next();
    hotelService.deleteUser(userId);
}

public static void viewUsers() {
    hotelService.viewUsers();
}

}
