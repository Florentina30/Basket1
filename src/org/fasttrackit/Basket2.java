package org.fasttrackit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Basket2 {
    public boolean findFruit(String fruit, List<String> allFruit){
        boolean hasFruitt= false;
        for(int i=0 ;i<allFruit.size();i++){
            if(allFruit.get(i).equals(fruit)){
                hasFruitt=true;
            }
        }
        return hasFruitt;
    }
    public boolean removeFruit(String fruit, List<String> allFruit){
        boolean hasFruitt= false;

        System.out.println("Lista de fructe inainte de procesare este: ");
        for(int i=0 ;i<allFruit.size();i++) {
            System.out.print(allFruit.get(i) + " ; ");
        }
        for(int i=0 ;i<allFruit.size();i++){
            if(allFruit.get(i).equals(fruit)){
                allFruit.remove(i);
                hasFruitt=true;
            }
        }
        System.out.println("Lista de fructe dupa procesare este: ");
        for(int i=0 ;i<allFruit.size();i++) {
            System.out.print(allFruit.get(i) + " ; ");
        }
        return hasFruitt;
    }
    public int[] Position(String fruit, List<String> allFruit){
        int j =0 ;
        int[] position = new int[allFruit.size()];
        boolean findFruit = findFruit(fruit, allFruit);
        if(findFruit==true){
            System.out.println("Fructul " + fruit +" se gaseste la pozitia: ");
            for(int i=0 ;i<allFruit.size();i++) {
                if(allFruit.get(i).equals(fruit)) {

                    position[j] = i;
                    j++;
                    System.out.print(" " + i + " ; ");
                }
            }
        }
        else {
            System.out.print("Fructul " + fruit + " nu se gaseste in lista ");
        }
      return position;
    }
    public Collection<String> distinct(List<String> allFruit){
        Collection<String> result = new ArrayList<String>();
        for (String fruit:allFruit
             ) {
            result.add(fruit);

        }
        return result;
    }
    public void addFruits (String fruit, List<String> allFruit){
        allFruit.add(fruit);
        System .out.println("Fructul adaugat in lista este "+ fruit);
        System .out.println("Noua lista este: ");
        for (String fruitresult:allFruit
        ) {
            System.out.print(" ; " +fruitresult);

        }


        }
    public int counter (List<String> allFruit ){
      int i  = 0 ;
        for( i =0 ; i<allFruit.size(); i++ ){

        }
        return i;
    }
    public int customCount(List<String> allFruit ){
        int i =0 ;
        for (String fruit:allFruit
             ) {
            i++;

        }
        return i;

    }
    }

