package com.adneom.partition;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> list = new ArrayList<>();

        //Ajout d elements dans la liste
        for (int i = 1; i <= 15; i++) {
            list.add(i);
        }

        //Affichage en utilisant la fonction partition avec i sous listes
        for (int i = 1; i <= 7; i++) {
            System.out.println(Liste.partition(list, i));
        }
    }

}
