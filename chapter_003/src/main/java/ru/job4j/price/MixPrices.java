package ru.job4j.price;

import java.text.SimpleDateFormat;
import java.util.*;

public class MixPrices {
    List<Price> availablePrices = new ArrayList<>();

    public List<Price> mergePrice(List<Price> availablePrices, List<Price> incomingPrices) {
        return null;
    }


    public static void main(String[] args) {
        List<Price> availablePrices = new ArrayList<>();
        List<Price> incomingPrices = new ArrayList<>();

        availablePrices.add(new Price(1,
                "fruit",
                1,
                1,
                new GregorianCalendar(2017, 0, 1).getTime(),
                new GregorianCalendar(2017, 0, 31).getTime(),
                11000));

        incomingPrices.add(new Price(1,
                "fruit",
                1,
                1,
                new GregorianCalendar(2017, 0, 15).getTime(),
                new GregorianCalendar(2017, 0, 20).getTime(),
                11000));
    }


}
