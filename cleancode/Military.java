package homeworks.hw2.youtube.cleancode;

public class Military extends Customer{
    private double discountRate = 0.50;


    public Military(int id, String name) {
        super(id, name);
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
