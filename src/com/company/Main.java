package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input_line;
        do {
            while (true) {
                System.out.println("Введите целое число или \"End\", чтобы завершить ввод: ");
                input_line = scan.nextLine();
                try {
                    if (input_line.equals("End")) {
                        break;
                    }
                    int to_add = Integer.parseInt(input_line);
                    list.add(to_add);
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");
                }
            }
            System.out.println("Уникальных чисел: " + TestJarClass.calculate(list));
            list.clear();
            do {
                System.out.println("Начать заново? (Y/N): ");
                input_line = scan.nextLine();
            } while (!(input_line.equals("Y") || input_line.equals("N")));

        } while(input_line.equals("Y"));
    }
}
