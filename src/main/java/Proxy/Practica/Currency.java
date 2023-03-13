package Proxy.Practica;

public enum Currency {
    BOB, USD, EUR, AUD, GBP;

    private static double[][] rates = {{1, 0.15, 0.14, 0.21, 0.12},
            {6.87, 1, 0.95, 1.44, 0.81},
            {7.24, 1.05, 1, 1.51, 0.86},
            {4.79, 0.7, 0.66, 1, 0.57},
            {8.44, 1.23, 1.17, 1.76, 1}};

    public static double rate(Currency a, Currency b){
        return rates[a.ordinal()][b.ordinal()];
    }
}
