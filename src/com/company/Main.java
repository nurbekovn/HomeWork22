package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumber = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();

        for (int i = 0; i < 51; i++) {
            int a = random.nextInt(1, 100);
            numbers.add(a);
            if (a % 2 == 0) {
                evenNumber.add(a);
            } else {
                oddNumber.add(a);
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Even numbers: " + evenNumber);
        System.out.println("Odd numbers: " + oddNumber);

    }
}
