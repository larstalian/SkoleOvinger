public class oppgave2 {
    public static void main(String[] args) {
        double meatA = 35.90, meatB = 35.90;
        int weightA = 450, weightB = 500;
        double cost_per_gramA = (meatA / weightA), cost_per_gramB = (meatB / weightB);
        boolean b = cost_per_gramA < cost_per_gramB;
        System.out.println("KjøttA er billigere enn kjøtt B: " + b);
    }
}
