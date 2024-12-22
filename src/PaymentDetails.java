public class PaymentDetails {
    private String userId;
    private String cardHolderName;
    private int cardNumber;
    private int cvv;
    private String expiryDate;

    public PaymentDetails(String userId, String cardHolderName, int cardNumber, int cvv, String expiryDate) {
        this.userId = userId;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }
    //getter
    public String getUserId() {
        return userId;
    }
    public String getCardHolderName() {
        return cardHolderName;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public int getCvv() {
        return cvv;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    //setter
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


}
