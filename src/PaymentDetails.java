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
}
