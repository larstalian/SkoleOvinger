public class Oppgave1 {

    private double numerator;
    private double denominator;
    private String result;


    public Oppgave1(double numerator, double denominator) throws IllegalArgumentException {
        if (denominator == 0) throw new IllegalArgumentException("Bad Input");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Oppgave1(double numerator) {
        this.numerator = numerator;
        this.denominator = 1;

    }

    public String getResult() {
        return result;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void sum(double n, double d) {
        double newNumerator = (numerator * d + denominator * n);
        double newDenominator = (denominator * d);
        result = (newNumerator + "/" + newDenominator);
    }


    public void sub(double n, double d) {
        double newNumerator = (numerator * d - denominator * n);
        double newDenominator = (denominator * d);
        result = (newNumerator + "/" + newDenominator);
    }

    public void mul(double n, double d) {
        double newNumerator = (numerator * n);
        double newDenominator = (denominator * d);
        result = (newNumerator + "/" + newDenominator);
    }

    public void div(double n, double d) {
        double newNumerator = (numerator * d);
        double newDenominator = (denominator * n);
        result = (newNumerator + "/" + newDenominator);
    }

    public static void main(String[] args) {
        Oppgave1 fraction1 = new Oppgave1(1.0, 2.0);
        Oppgave1 fraction2 = new Oppgave1(3.0, 8.0);
        Oppgave1 fraction3 = new Oppgave1(1.0);

        fraction1.sum(fraction2.getNumerator(), fraction2.getDenominator());
        System.out.println(fraction1.getResult());

        fraction1.sub(fraction2.getNumerator(), fraction2.getDenominator());
        System.out.println(fraction1.getResult());

        fraction1.mul(fraction2.getNumerator(), fraction2.getDenominator());
        System.out.println(fraction1.getResult());

        fraction1.div(fraction2.getNumerator(), fraction2.getDenominator());
        System.out.println(fraction1.getResult());

        fraction3.sum(fraction1.getNumerator(), fraction1.getDenominator());
        System.out.println(fraction3.getResult());
    }

}
