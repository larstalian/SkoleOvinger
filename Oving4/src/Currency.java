public class Currency {
    private final double currencyValue;

    public Currency(double currencyValue) {
        this.currencyValue = currencyValue;
    }

    public double convertToNok(double convertInput) {
        return convertInput * currencyValue;
    }

    public double convertFromNok(double convertInput) {
       return convertInput / currencyValue;
    }
}