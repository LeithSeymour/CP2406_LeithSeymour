package Prac6;

public class DemoCandles {
    public static void main(String[] args) {
        Candles candleOne = new Candles();
        ScentedCandles scentedCandleOne = new ScentedCandles();

        candleOne.setColour("Yellow");
        candleOne.setHeight(10);
        System.out.println("This candle is " + candleOne.getColour() + " and is at " + candleOne.getHeight() + " inches tall," +
                " it costs $" + candleOne.getPrice());

        scentedCandleOne.setColour("Blue");
        scentedCandleOne.setHeight(10);
        System.out.println("This candle is " + scentedCandleOne.getColour() + " and is at " + scentedCandleOne.getHeight() +
        " inches tall, it costs $" + scentedCandleOne.getPrice());

    }
}
