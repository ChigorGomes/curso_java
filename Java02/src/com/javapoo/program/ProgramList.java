package com.javapoo.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add("Maggie");
        list.add(2, "Nick"); //adiciona na posição especificada

        System.out.println(list.size()); // tamanho da lista


        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------------------------");

        list.removeIf(x -> x.charAt(0) == 'M'); //remove todos os nomes que tem M como a primeira letra

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));


        System.out.println("----------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        result.forEach(x -> System.out.println(x));

        System.out.println("----------------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);


    }
}
