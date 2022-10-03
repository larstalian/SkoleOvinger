class Matrise {
    private final double[][] verdier;

    public Matrise(int antallRader, int antallKolonner) {
        verdier = new double[antallRader][];
        for (int i = 0; i < antallRader; i++) {
            verdier[i] = new double[antallKolonner];
            for (int j = 0; j < antallKolonner; j++) {
                verdier[i][j] = 0.0;
            }
        }
    }

    //get metoder
    public int getAntallRader() {
        return verdier.length;
    }

    public int getAntallKolonner() {
        return verdier[0].length;
    }

    public double getVerdi(int rad, int kolonne) throws ArrayIndexOutOfBoundsException {
        return verdier[rad][kolonne];
    }

    //setmetoder
    public void setVerdi(int rad, int kolonne, double verdi) throws ArrayIndexOutOfBoundsException {
        verdier[rad][kolonne] = verdi;
    }

    public Matrise sum(Matrise matrise) {
        if (matrise.getAntallRader() != getAntallRader() || matrise.getAntallKolonner() != getAntallKolonner()) { //sjekker om matrisen stemmer
            return null;
        }

        Matrise sum = new Matrise(getAntallRader(), getAntallKolonner());
        for (int i = 0; i < getAntallRader(); i++) {
            for (int j = 0; j < getAntallKolonner(); j++) {
                sum.setVerdi(i, j, verdier[i][j] + matrise.getVerdi(i, j));
            }
        }
        return sum;
    }

    //metoder
    public Matrise mul(Matrise matrise) {
        if (matrise.getAntallRader() != getAntallKolonner()) {
            return null;
        }

        Matrise sum = new Matrise(getAntallRader(), matrise.getAntallKolonner());

        for (int i = 0; i < getAntallRader(); i++) {
            for (int j = 0; j < getAntallKolonner(); j++) {
                for (int k = 0; k < getAntallKolonner(); k++) {
                    sum.setVerdi(i, j, sum.getVerdi(i, j) + verdier[i][k] * matrise.getVerdi(k, j));
                }
            }
        }
        return sum;
    }

    public Matrise transponer() {
        Matrise resultat = new Matrise(getAntallKolonner(), getAntallRader());
        for (int i = 0; i < getAntallRader(); i++) {
            for (int j = 0; j < getAntallKolonner(); j++) {
                resultat.setVerdi(j, i, verdier[i][j]);
            }
        }
        return resultat;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < getAntallRader(); i++) {
            for (int j = 0; j < getAntallKolonner(); j++) {
                str.append(verdier[i][j]).append("\t");
            }
            str.append("\n");
        }
        return str.toString();
    }

    public static void main(String[] args) {

        Matrise matrise1 = new Matrise(2, 2);
        Matrise matrise2 = new Matrise(2, 2);

        matrise1.setVerdi(0, 0, 4.0);
        matrise1.setVerdi(0, 1, 3.0);
        matrise1.setVerdi(1, 0, 7.0);
        matrise1.setVerdi(1, 1, 2.0);

        matrise2.setVerdi(0, 0, 6.0);
        matrise2.setVerdi(0, 1, 4.0);
        matrise2.setVerdi(1, 0, 2.0);
        matrise2.setVerdi(1, 1, 1.0);

        System.out.println("Matrise 1:\n" + matrise1);
        System.out.println("Matrise 2:\n" + matrise2);

        Matrise sum = matrise1.sum(matrise2);
        System.out.println(sum != null ? "Matrisesum:\n" + sum : "\nIkke mulig å summere matrisene.");

        Matrise produkt = matrise1.mul(matrise2);
        System.out.println(produkt != null ? "Matriseprodukt:\n" + produkt : "\nIkke mulig å multiplisere matrisene.");

        Matrise transponert = matrise1.transponer();
        System.out.println("Matrise 1 transponert:\n" + transponert.toString());
    }
}