public class Matrise {

    static int[][] sum = new int[3][3];

    public static int[][] matriceSum(int[][] matriceA, int[][] matriceB) {
        try {
            for (int i = 0; i < matriceB.length; i++) {
                for (int j = 0; j < matriceA.length; j++) {
                    sum[i][j] = matriceB[i][j] + matriceA[i][j];
                }
            }
            return sum;
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            return new int[0][0];
        }
    }


    public static int[][] matriceMul(int[][] matriceA, int[][] matriceB) {
        try {
            for (int i = 0; i < matriceA.length; i++)
                for (int j = 0; j < matriceA.length; j++)
                    for (int k = 0; k < 3; k++) sum[i][j] += matriceB[i][k] * matriceA[k][j];  //Kryss multiplikasjon

            return sum;

        } catch (Exception e) {
            System.out.println("Something went wrong1");
            return new int[0][0];
        }
    }

    public static int[][] matriceTranspose(int[][] matrice) {
        try {
            for (int i = 0; i < matrice.length; i++)
                for (int j = 0; j < matrice.length; j++) {
                    sum[i][j] = matrice[j][i];
                }
            return sum;

        } catch (Exception e) {
            System.out.println("Something went wrong1");
            return new int[0][0];
        }
    }

    public static void matrisePrint(int[][] matrice) {
        for (int[] ints : matrice) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriceA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriceB = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        matrisePrint(matriceSum(matriceA, matriceB));
        matrisePrint(matriceMul(matriceA, matriceB));
        matrisePrint(matriceTranspose(matriceA));
        matrisePrint(matriceMul(matriceA, matriceA));
    }
}
