public class Currency {
    private final double currencyValue;

    public Currency(double currencyValue) {
        this.currencyValue = currencyValue;
    }

    public double convertToNok(double exchangeInput) {
        return exchangeInput * currencyValue;
    }

    public double convertFromNok(double exchangeInput) {
       return exchangeInput / currencyValue;
    }
}