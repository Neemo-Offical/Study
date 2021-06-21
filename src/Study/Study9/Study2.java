package src.Study.Study9;

public class Study2 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL","Oracle Corporatation",34.5,34.35);
        System.out.println("今日市值变化为" + stock1.getChangePercent() + "%");
    }

    static class Stock {
        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;

        Stock(String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice) {
            symbol = newSymbol;
            name = newName;
            previousClosingPrice = newPreviousClosingPrice;
            currentPrice = newCurrentPrice;
        }
        double getChangePercent() {
            return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
        }
    }
}