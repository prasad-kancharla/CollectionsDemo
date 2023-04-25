package io.skillsquad.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("Java");

        System.out.println("First Element in the list: " + list.get(0));
        System.out.println("Second Element in the list: " + list.get(1));
        System.out.println(" ");

        // Generics
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
//        numbersList.add("Test");
        numbersList.add(20);
        numbersList.add(30);
        int size = numbersList.size();
        System.out.println("Size of numbers list is - " + size);
        System.out.println("Index of number 30 in numbers list - " + numbersList.indexOf(30));

        System.out.println(" ");

        System.out.println("The numbers list contains number 10 - " + numbersList.contains(10));
        System.out.println("The numbers list contains number 10 - " + numbersList.contains(40));

        System.out.println(" ");

        numbersList.remove(1);
        printList(numbersList);

        System.out.println("Index of number 30 in numbers list - " + numbersList.indexOf(30));
        numbersList.clear();
        System.out.println("Size of numbers list is - " + numbersList.size());
        System.out.println(" ");

        List<String> names = new LinkedList<>();
        System.out.println("The names list empty - " + names.isEmpty());

    }

    private static void printList(List list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(" ");
    }

}
