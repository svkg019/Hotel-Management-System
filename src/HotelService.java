import java.util.*;

public class HotelService {
    private final UserDAO userDAO;
    private final BookingDAO bookingDAO;
    private final RoomDAO roomDAO;
    private final ComplaintDAO complaintDAO;
    private final PaymentDetailsDAO paymentDetailsDAO;

    public HotelService() {
        userDAO = new UserDAO();
        bookingDAO = new BookingDAO();
        roomDAO = new RoomDAO();
        complaintDAO = new ComplaintDAO();
        paymentDetailsDAO = new PaymentDetailsDAO();
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

    //Rooms Section
    Room r1 = new Room(119,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r2 = new Room(101,"1BHK","Darjeeling",2000,false,"19/12/24");
    Room r3 = new Room(102,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r4 = new Room(103,"3BHK","Kolkata",3000,false,"19/12/24");
    Room r5 = new Room(104,"1BHK","Kolkata",1000,false,"19/12/24");
    Room r6 = new Room(105,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r7 = new Room(106,"3BHK","Kolkata",3000,false,"19/12/24");
    Room r8 = new Room(107,"1BHK","Kolkata",1000,false,"19/12/24");
    Room r9 = new Room(108,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r10 = new Room(109,"3BHK","Kolkata",3000,false,"19/12/24");
    Room r11 = new Room(110,"1BHK","Kolkata",1000,false,"19/12/24");
    Room r12 = new Room(111,"2BHK","Kolkata",2000,false,"19/12/24");
    Room r13 = new Room(112,"3BHK","Kolkata",3000,false,"19/12/24");
    Room r14 = new Room(113,"2BHK","Darjeeling",3000,false,"19/12/24");
    Room r15 = new Room(114,"3BHK","Darjeeling",4000,false,"19/12/24");





    //Contact
    public void contactInformation() {
        System.out.println("Mobile No.: +91-0000000000");
        System.out.println("Email: support@hotel.com");
    }

    //Complaint
    public void registerComplaint(Complaint complaint) {
        complaintDAO.addComplaint(complaint);
    }
    public void viewComplaints() {
        List<Complaint> complaintsList = new ArrayList<>();
        complaintsList = complaintDAO.getAllComplaints();
        for(Complaint c : complaintsList) {
            System.out.println(c.getUserName()+"\n"+c.getContactNumber()+"\n"+c.getRoomNumber()+"\n"
                    +c.getTypeOfComplaint()+"\n"+c.getFeedbackRating());
            System.out.println("-------------------------");
        }
    }

    //Payment
    public void billCalculation(Booking booking) {
        double totalBill = 0;
        int days = 2;
        int roomCharge=0;
        if(booking.getRoomType()==1) {
            roomCharge=1000;
        }else if(booking.getRoomType()==2) {
            roomCharge=2000;
        }else {
            roomCharge=3000;
        }
        int extra = 0;
        if(booking.getLocation()=="Darjelling") {
            extra = 1000;
        }
        totalBill = (roomCharge*days)+extra;
        System.out.println("Room Charge: "+ roomCharge);
        System.out.println("Extra charge for premium location: "+ extra);
        System.out.println("Total Bill: "+ totalBill);
    }

    public Booking bookingFinder(String userId) {
        List<Booking> bookings = bookingDAO.getAllBookings();
        for (Booking booking : bookings) {
            if (booking.getCustomerId().equalsIgnoreCase(userId)) {
                return booking;
            }
        }
        return null;
    }

    public void addPaymentDetails(PaymentDetails pd) {
        paymentDetailsDAO.addPaymentDetails(pd);

    }

    public void getPaymentDetailsByUserID(String UserID) {
        List<PaymentDetails> paymentHistory = paymentDetailsDAO.getAllBookings();
        for(PaymentDetails pd:paymentHistory) {
            if(UserID.equals(pd.getUserId())) {
            }
        }
    }





}
