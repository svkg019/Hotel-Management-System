public class Booking {
    private int bookingId;
    private String roomType;
    private String bookingDetails;
    private double price;

    public Booking(int bookingId, String roomType, String bookingDetails, double price) {
        this.bookingId = bookingId;
        this.roomType = roomType;
        this.bookingDetails = bookingDetails;
        this.price = price;
    }
}
