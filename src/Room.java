public class Room {
    private short roomNumber;
    private boolean isBooked;
    private String roomType;
    private int dateOfAvailability;
    private int price;
    private String place;

    public Room(short roomNumber, boolean isBooked, String roomType, int dateOfAvailability, int price, String place) {
        this.roomNumber = roomNumber;
        this.isBooked = isBooked;
        this.roomType = roomType;
        this.dateOfAvailability = dateOfAvailability;
        this.price = price;
        this.place = place;
    }

    public short getRoomNumber() {
        return roomNumber;
    }
    public boolean getIsBooked() {
        return isBooked;
    }
    public String getRoomType() {
        return roomType;
    }
    public int getDateOfAvailability() {
        return dateOfAvailability;
    }
    public int getPrice() {
        return price;
    }
    public String getPlace() {
        return place;
    }

    public void setRoomNumber(short roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public void setDateOfAvailability(int dateOfAvailability) {
        this.dateOfAvailability = dateOfAvailability;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setPlace(String place) {
        this.place = place;
    }
}
