public class Room {
  private String roomType;
    private int dateOfAvailability;
    private int price;
    private String place;

    public Room(String roomType, int dateOfAvailability, int price, String place) {
        this.roomType = roomType;
        this.dateOfAvailability = dateOfAvailability;
        this.price = price;
        this.place = place;
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
