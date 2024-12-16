public class Reservation {
    private int reservationId;
    private String checkInDate;
    private String checkOutDate;
    private String roomPreference;
    private String name;
    private String contact;

    public Reservation(int reservationId, String checkInDate, String checkOutDate, String roomPreference, String name, String contact) {
        this.reservationId = reservationId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomPreference = roomPreference;
        this.name = name;
        this.contact = contact;
    }
}
