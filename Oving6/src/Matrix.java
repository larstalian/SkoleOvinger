import java.util.Arrays;

public record Matrix(double[][] data) {

    public double[][] mul(double[][] b) {

        try {
            double[][] a = data();
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

    public double[][] sum(double[][] b) {

        try {
            double[][] a = data();
            double[][] c = new double[3][3];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    c[i][j] = a[i][j] + b[i][j];

                }
            }
            return c;

        } catch (Exception e) {
            System.out.println("Something went wrong!");
            return new double[0][0];
        }
    }

    public double[][] transpose(double[][] a) {

        try {
            double[][] c = new double[3][3];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    c[i][j] = a[j][i];
                }
            }
            return c;

        } catch (Exception e) {
            System.out.println("Something went wrong!");
            return new double[0][0];
        }
    }

    public static void main(String[] args) {

        double[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Matrix matrix1 = new Matrix(a);

        double[][] g = matrix1.mul(b);
        double[][] p = matrix1.sum(b);
        double[][] t = matrix1.transpose(a);

        System.out.println("Matrix 1 and 2 multiplied:");
        Arrays.stream(g).forEach(value -> {
            Arrays.stream(value).mapToObj(i -> i + "  ").forEach(System.out::print);
            System.out.println();
        });
        System.out.println("\n\nMatrix 1 and 2 sum:");

        Arrays.stream(p).forEach(value -> {
            Arrays.stream(value).mapToObj(i -> i + "  ").forEach(System.out::print);
            System.out.println();
        });
        System.out.println("\n\nTransposed Matrix:");

        Arrays.stream(t).forEach(ints -> {
            Arrays.stream(ints).mapToObj(anInt -> anInt + "  ").forEach(System.out::print);
            System.out.println();
        });

    }
}