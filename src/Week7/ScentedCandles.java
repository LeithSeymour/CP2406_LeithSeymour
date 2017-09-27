package Week7;

public class ScentedCandles extends Candles {
    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    String scent;

    public void setPrice(int height) {
        this.price = height * 3.00;
    }
}
