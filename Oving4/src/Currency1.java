public class Currency1 {
    public static void currency1(int input2, double input3) {
        double[] currencyType = {0.0 /*default*/, 10.0/*usd*/, 9.92, /*eur*/0.92 /*sek */};
        double resultInNok;
        resultInNok = input3 * currencyType[input2];
        System.out.printf("%.2f", resultInNok);
        System.out.println(" NOK");
    }

    public static void currency2(int input2, double input3) {
        double[] currencyType = {0.0 /*default*/, 10.0/*usd*/, 9.92, /*eur*/0.92 /*sek */};
        String[] currencyTypeText = {"default", " USD", " EUR", " SEK"};
        double resultFromNok = input3 / currencyType[input2];
        System.out.printf("%.2f", resultFromNok);
        System.out.println(currencyTypeText[input2]);
    }

}
