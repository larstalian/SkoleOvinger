public class Matrise {

    public Matrise() {
    }

    public double[][] mul(double[][] a, double[][] b) {

        try {

            double[][] c = new double[3][3];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    for (int k = 0; k < 3; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return c;

        } catch (Exception e) {
            System.out.println("Something went wrong");
            return new double[0][0];
        }
    }

    public double[][] sum(double[][] a, double[][] b) {

        try {

            double[][] c = new double[3][3];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    c[i][j] = a[i][j] + b[i][j];

                }
            }
            return c;

        } catch (Exception e) {
            System.out.println("Error!!!");
            return new double[0][0];
        }

    }

    public double[][] transpose(double[][] a) {

        try {
            double[][] c = new double[3][3]; // 3 rows and 3 columns

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    c[i][j] = a[j][i];

                }
            }
            return c;

        } catch (Exception e) {
            System.out.println("Error!!!");
            return new double[0][0];
        }

    }

    public static void main(String[] args) {

        double[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Matrise matrise = new Matrise();

        double[][] g = matrise.mul(a, b);
        double[][] p = matrise.sum(a, b);
        double[][] t = matrise.transpose(a);

        for (double[] value : g) {
            for (double i : value) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        for (double[] value : p) {
            for (double i : value) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        for (double[] ints : t) {
            for (double anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }

    }

}