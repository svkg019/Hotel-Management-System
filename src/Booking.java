public class Booking {
    private String customerId;
    private int bookingId;
    private String roomType;
    private String checkInDate;
    private String checkOutDate;
    private double price;
    private String Name;
    private String mobileNumber;
    private String email;

    public Booking(String customerId, int bookingId, String roomType, String checkInDate, String checkOutDate, double price, String Name, String mobileNumber, String email) {
        this.customerId = customerId;
        this.bookingId = bookingId;
        this.roomType = roomType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.price = price;
        this.Name = Name;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }


    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }
    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }
    public int getBookingId() {
        return bookingId;
    }

    public String getRoomType() {
        return roomType;
    }
    public String getCheckInDate() {
        return checkInDate;
    }
    public String getCheckOutDate() {
        return checkOutDate;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return Name;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getEmail() {
        return email;
    }
}
