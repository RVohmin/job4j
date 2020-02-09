package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int valueInRubles) {
        int rsl = valueInRubles / 70;
        return rsl;
    }

    public static int euroToRubles(int valueInEuro) {
        int rsl = valueInEuro * 70;
        return rsl;
    }

    public static int rubleToDollar(int valueInRubles) {
        int rsl = valueInRubles / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static int dollarToRubles(int valueInDollars) {
        int rsl = valueInDollars * 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(1000);
        int dollar = Converter.rubleToDollar(1000);

        System.out.println("1000 rubles are " + euro + " euro.");
        System.out.println("1000 rubles are " + dollar + " dollar.");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);

        int inRubles = 120;
        int expectedDollars = 2;
        int outDollars = rubleToDollar(inRubles);
        boolean passedDollars = expectedDollars == outDollars;
        System.out.println("120 rubles are 2 dollars. Test result : " + passedDollars);
    }
}
