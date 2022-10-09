import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public final class Matrix {
    private final double[][] data;
    private final int columns;
    private final int rows;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new double[rows][columns];
    }

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.columns = data[0].length;
        this.data = new double[rows][columns];
        IntStream.range(0, rows).forEach(i -> System.arraycopy(data[i], 0, this.data[i], 0, columns));

    }

    public Matrix mul(Matrix b) {

        try {
            Matrix a = this;
            Matrix c = new Matrix(rows, columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    for (int k = 0; k < 3; k++) {
                        c.data[i][j] += a.data[i][k] * b.data[k][j];
                    }
                }
            }
            return c;

        } catch (Exception e) {
            System.out.println("Something went wrong");
            return null;
        }
    }

    public Matrix sum(Matrix b) {

        try {
            Matrix a = this;
            Matrix c = new Matrix(rows, columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    c.data[i][j] = a.data[i][j] + b.data[i][j];

                }
            }
            return c;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public Matrix transpose() {

        try {
            Matrix a = this;
            Matrix c = this;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    c.data[i][j] = a.data[j][i];
                }
            }
            return c;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public String toString() {
        StringBuilder output = new StringBuilder("\n");
        for (double[] row : data) {
            output.append(Arrays.toString(row)).append("\n");
        }
        return output.toString();
    }

    public static void main(String[] args) {
        double[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] b = {{1, 2, 7}, {3, 5, 6}, {1, 4, 0}};
        Matrix matrixB = new Matrix(b);
        Matrix matrixA = new Matrix(a);
        Matrix matrixC = matrixA.mul(matrixB);
        System.out.println(matrixC);
        System.out.println(Objects.requireNonNull(matrixA.sum(matrixB)));
        System.out.println(matrixB.transpose());


    }
}