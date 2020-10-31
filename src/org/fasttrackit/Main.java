package org.fasttrackit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Basket2 basket = new Basket2();

        String fruit = "struguri";
        String fruit1 = "prune";
        List<String> allFruit = new ArrayList();
        allFruit.add("mar");
        allFruit.add("pere");
        allFruit.add("prune");
        allFruit.add("nuci");
        allFruit.add("prune");
        allFruit.add("pere");
        allFruit.add("prune");
//boolean result = basket.removeFruit(fruit1 ,allFruit);

        System.out.println("Fructul " + fruit + " este regasit in lista de fructe " + basket.findFruit(fruit, allFruit));

        System.out.println("Fructul " + fruit1 + " este regasit in lista de fructe " + basket.findFruit(fruit1, allFruit));

        int[] resultPosition = basket.Position(fruit1, allFruit);
        System.out.println(" Colectia de fructe este ");
        Collection<String> resultDistinct = basket.distinct(allFruit);
        for (String resultFruit:resultDistinct
             ) {
            System.out.println(resultFruit);
        }
        String addFruit = "banana";
basket.addFruits(addFruit, allFruit);
System.out.println();
        int counterFruit = basket.counter(allFruit);
        System.out.println(" Cosul contine un numar de: "+counterFruit + "  fructe");
        counterFruit= basket.customCount(allFruit);
        System.out.println();
        System.out.println(" Cosul personalizat contine un numar de: "+counterFruit + "  fructe");
        }


    }

