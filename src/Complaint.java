public class Complaint {
    private String userName;
    private int contactNumber;
    private short roomNumber;
    private String typeOfComplaint;
    private short feedbackRating;

    public Complaint(String userName, int contactNumber, short roomNumber, String typeOfComplaint, short feedbackRating) {
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.roomNumber = roomNumber;
        this.typeOfComplaint = typeOfComplaint;
        this.feedbackRating = feedbackRating;
    }

    //add getters and setters
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
    public short getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(short roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getTypeOfComplaint() {
        return typeOfComplaint;
    }
    public void setTypeOfComplaint(String typeOfComplaint) {
        this.typeOfComplaint = typeOfComplaint;
    }
    public short getFeedbackRating() {
        return feedbackRating;
    }
    public void setFeedbackRating(short feedbackRating) {
        this.feedbackRating = feedbackRating;
    }
}
