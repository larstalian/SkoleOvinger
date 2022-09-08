public class Valuta {
    private double exchangerateToNok;
    private String id;

    public String getId() {
        return id;
    }

    public Valuta(double exchangerateToNok, String id) {
        this.exchangerateToNok = exchangerateToNok;
        this.id = id;
    }

    public double ToNok(double amount) {
        return amount * this.exchangerateToNok;
    }

    public double FromNok(double amount) {
        return amount / this.exchangerateToNok;
    }
}
//kan lage en ny klasse bank som har alle valutaene