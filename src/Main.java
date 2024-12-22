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
                                    bookingService();
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
                                    viewBill();
                                    break;
                                case 6:
                                    hotelService.viewComplaints();
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
                            System.out.println("3. Room Status");
                            System.out.println("4. Check-out Billing");
                            System.out.println("5. Complaints");
                            System.out.println("6. Contact");
                            System.out.println("7. Go-Back");
                            switch (sc.nextInt()) {
                                case 1:
                                    reservationService();
                                    break;
                                case 2:
                                    System.out.println("View Booking History");
                                    break;
                                case 3:
                                    hotelService.getRoomDetails();
                                    break;
                                case 4:
                                    payBill();
                                    break;
                                case 5:
                                    addComplaint();
                                    break;
                                case 6:
                                    hotelService.contactInformation();
                                    break;
                                case 7:
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

    public static void addComplaint() {
        System.out.print("Please enter your user name: ");
        String userName = sc.next();sc.nextLine();
        System.out.print("Please enter your contact number: ");
        int contact = sc.nextInt();
        System.out.print("Please enter your room number: ");
        int roomNumber = sc.nextInt();
        System.out.println("Type of complaint:");
        System.out.println("1. Poor housekeeping\n"
                + "2. Noisy guests\n"
                + "3. Uncomfortable beds\n"
                + "4. Slow service\n"
                + "5. Lack of amenities\n"
                + "6. Unfriendly staff\n"
                + "7. No Complain");
        int typeOfComplaint = sc.nextInt();
        String complaintType = "";
        switch(typeOfComplaint){
            case 1:
                complaintType = "Poor housekeeping";
                break;
            case 2:
                complaintType = "Noisy guests";
                break;
            case 3:
                complaintType = "Uncomfortable beds";
                break;
            case 4:
                complaintType = "Slow service";
                break;
            case 5:
                complaintType = "Lack of amenities";
                break;
            case 6:
                complaintType = "Unfriendly staff";
                break;
            case 7:
                complaintType = "No Complain";
                break;
            default:
                complaintType = "No Complain";
        }
        System.out.println("Rating:");
        System.out.println("1. *****\n"
                + "2. ****\n"
                + "3. ***\n"
                + "4. **\n"
                + "5. *\n"
        );
        int rating = sc.nextInt();
        String feedback = "";
        switch(rating){
            case 1:
                feedback = "*****";
                break;
            case 2:
                feedback = "****";
                break;
            case 3:
                feedback = "***";
                break;
            case 4:
                feedback = "**";
                break;
            case 5:
                feedback = "*";
                break;
            default:
                feedback = "*****";
        }
        Complaint complain = new Complaint(userName,contact,roomNumber,complaintType,feedback);
        hotelService.registerComplaint(complain);
        System.out.println("Complain registered successfully");
    }
    public static void payBill() {
        System.out.println("Please enter your user ID: ");
        String userId = sc.next();
        Booking booking = hotelService.bookingFinder(userId);
        if(booking==null) {
            System.out.println("No booking found!");
        }
        else {
            hotelService.billCalculation(booking);
            int exit=0;
            do {
                System.out.println("Do you want to pay now?");
                System.out.println("1. Yes");
                System.out.println("2. Later");
                int choice = sc.nextInt();
                switch(choice) {
                    case 1:
                        System.out.println("Please enter your payment details:");
                        System.out.println("Card holder name: ");
                        String name = sc.nextLine();
                        System.out.print("Card number: ");
                        int cardNumber = sc.nextInt();
                        System.out.print("CVV: ");
                        int cvv = sc.nextInt();sc.nextLine();
                        System.out.print("Expiry Date: ");
                        String ed = sc.next();
                        PaymentDetails pd = new PaymentDetails(userId,name,cardNumber,cvv,ed);
                        hotelService.addPaymentDetails(pd);
                        System.out.println("Payment Successful");
                        break;
                    case 2:
                        exit=1;
                        break;
                    default:
                        System.out.println("Invalid Option! Try again.");
                }
            }while(exit==0);
        }
    }
    public static void viewBill() {
        System.out.println("Please enter the user ID: ");
        String userId = sc.next();
        Booking booking = hotelService.bookingFinder(userId);
        if(booking==null) {
            System.out.println("No booking found!");
        }else {
            hotelService.billCalculation(booking);
            int exit=0;
            do {
                System.out.println("Do you want to approved the payment?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choice = sc.nextInt();
                switch(choice) {
                    case 1:
                        System.out.println("Payment Approved!");
                        break;
                    case 2:
                        exit=1;
                        break;
                    default:
                        System.out.println("Invalid Option! Try again.");
                }
            }while(exit==0);
        }

    }

    public static void reservationService() {
        int exit=0;
        do {
            System.out.println("1. New reservation");
            System.out.println("2. Update reservation");
            System.out.println("3. Delete reservation");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("New Reservation");
                    break;
                case 2:
                    System.out.println("Update Reservation");
                    break;
                case 3:
                    System.out.println("Delete Reservation");
                    break;
                case 4:
                    exit=1;
                    break;
                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }while(exit==0);
    }

    public static void bookingService() {
        int exit=0;
        do {
            System.out.println("1. New reservation");
            System.out.println("2. Update reservation");
            System.out.println("3. Delete reservation");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("New Booking");
                    break;
                case 2:
                    System.out.println("Update Booking");
                    break;
                case 3:
                    System.out.println("Delete Booking");
                    break;
                case 4:
                    exit=1;
                    break;
                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }while(exit==0);
    }
}

