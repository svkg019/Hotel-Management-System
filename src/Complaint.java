public class Complaint {
    private String userName;
    private int contactNumber;
    private int roomNumber;
    private String typeOfComplaint;
    private String feedbackRating;

    public Complaint(String userName, int contactNumber, int roomNumber, String typeOfComplaint, String feedbackRating) {
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
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getTypeOfComplaint() {
        return typeOfComplaint;
    }
    public void setTypeOfComplaint(String typeOfComplaint) {
        this.typeOfComplaint = typeOfComplaint;
    }
    public String getFeedbackRating() {
        return feedbackRating;
    }
    public void setFeedbackRating(String feedbackRating) {
        this.feedbackRating = feedbackRating;
    }
}
