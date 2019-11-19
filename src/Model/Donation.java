package Model;

public class Donation {

    private float amount;
    private boolean paymentType;

    public Donation(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
