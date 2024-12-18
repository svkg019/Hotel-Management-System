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
                    String role = login();
                    if (role.equals("admin")) {
                        boolean flag1 = true;
                        do {
                            System.out.println("+++++Admin Menu+++++");
                            System.out.println("1. Booking Hotel Services");
                            System.out.println("2. View Booking History");
                            System.out.println("3. View Booking History by ID");
                            System.out.println("4. Room Status");
                            System.out.println("5. Check-out Billing Invoice");
                            System.out.println("6. View Complaints");
                            System.out.println("7. Go-Back");
                            switch (sc.nextInt()) {
                                case 1:
                                    System.out.println("Booking Hotel Services");
                                    break;
                                case 2:
                                    hotelService.viewBookingHistory();
                                    break;
                                case 3:
                                    viewBookingHistoryByID();
                                    break;
                                case 4:
                                    System.out.println("Room Status");
                                    break;
                                case 5:
                                    System.out.println("Check-out Billing Invoice");
                                    break;
                                case 6:
                                    System.out.println("View Complaints");
                                    break;
                                case 7:
                                    flag1 = false;
                                    break;
                                default:
                                    System.out.println("Invalid option");
                                    break;
                            }

                        }while(flag1);
                    } else if (role.equals("user")) {
                        boolean flag1 = true;
                        do {
                            System.out.println("+++++Customer Menu+++++");
                            System.out.println("1. Reservation");
                            System.out.println("2. View Booking History");
                            System.out.println("3. Check-out Billing");
                            System.out.println("4. Complaints");
                            System.out.println("5. Contact");
                            System.out.println("6. Go-Back");
                            switch (sc.nextInt()) {
                                case 1:
                                    System.out.println("Reservation");
                                    break;
                                case 2:
                                    System.out.println("View Booking History");
                                    break;
                                case 3:
                                    System.out.println("Check-out Billing");
                                    break;
                                case 4:
                                    System.out.println("Complaints");
                                    break;
                                case 5:
                                    System.out.println("Contact");
                                    break;
                                case 6:
                                    flag1 = false;
                                    break;
                                default:
                                    System.out.println("Invalid option");
                                    break;
                            }
                        }while(flag1);
                    } else {
                        System.out.println("Invalid credentials");
                    }
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

public static String login() {
    System.out.println("Enter your userId: ");
    String userId = sc.next();
    System.out.println("Enter your password: ");
    String password = sc.next();sc.nextLine();
    if (hotelService.userVerification(userId, password)) {
        System.out.println("Logged in successfully");
        if (hotelService.isAdmin(userId)) {
            return "admin";
        } else {
            return "user";
        }
    }
    return "invalid";
}

public static void viewBookingHistoryByID() {
    System.out.println("Enter the userId: ");
    String userId = sc.next();
    hotelService.viewBookingHistoryByID(userId);
}


}
