package Week7;

public class Candles {

    String colour;
    int height;
    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(int height) {
        this.price = height * 2.00;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        setPrice(this.height);
    }


}
