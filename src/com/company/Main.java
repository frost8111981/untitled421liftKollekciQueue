package com.company;

import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static final int START_FLOOR = 0;
    public static final int END_FLOOR = 25;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> floor = new PriorityQueue<>();
        System.out.println("Добро пожаловать!");

        while (true) {
            System.out.println("Введите номер этажа:");
            try {
                int input = sc.nextInt();
                sc.nextLine();

                if (input < START_FLOOR || input > END_FLOOR) {
                    System.out.println("Не верно введен этаж!");
                    continue;
                }
                if (input == START_FLOOR) {
                    break;
                }
                floor.add(input);
            } catch (InputMismatchException e) {
                System.out.println("Не корректный формат ввода");
                sc.nextLine();
            }
        }

        while (!floor.isEmpty()) {

            System.out.println("Этаж " + floor.poll());
        }

    }
}
