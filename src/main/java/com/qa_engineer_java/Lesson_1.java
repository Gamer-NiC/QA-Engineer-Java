package com.qa_engineer_java;

public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumInRange(8, 13));
        positiveOrNegative(-8);
        System.out.println(isNehative(-8));
        printString("Hello world!",3);
        System.out.println(isLeapYear(2024));
        invertArray();
        Array100();
        numberArray();
        fillDiagonal();
        justArray(3,8);
    }

    // Задание 1:
    static void printThreeWords() {
        System.out.println("Задание 1:");
        String fruits = "Orange\nBanana\nApple";
        System.out.println(fruits);
    }

    // Задание 2:
    static void checkSumSign() {
        System.out.println("\nЗадание 2:");
        int a = 8, b = 13, c = a + b;
        String sum = (c >= 0) ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(sum);
    }

    // Задание 3:
    static void printColor() {
        System.out.println("\nЗадание 3:");
        int value = 8;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    // Задание 4:
    static void compareNumbers() {
        System.out.println("\nЗадание 4:");
        int a = 8, b = 13;
        String num = (a >= b) ? "a >= b" : "a < b";
        System.out.println(num);
    }

    // Задание 5:
    static boolean checkSumInRange(int a, int b) {
        System.out.println("\nЗадание 5:");
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // Задание 6:
    static void positiveOrNegative(int a) {
        System.out.println("\nЗадание 6:");
        String num = (a >= 0) ? " положительное" : " отрицательное";
        System.out.println("Число " + a + num);
    }

    // Задание 7:
    static boolean isNehative(int a) {
        System.out.println("\nЗадание 7:");
        return a < 0;
    }

    // Задание 8:
    static void printString(String words, int a) {
        System.out.println("\nЗадание 8:");
        for (int i = 0; i < a; i++) {
            System.out.println(words);
        }
    }

    // Задание 9:
    static boolean isLeapYear(int a) {
        System.out.println("\nЗадание 9:");
        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
    }

    // Задание 10:
    static void invertArray() {
        System.out.println("\nЗадание 10:");
        int[] arr = {1,0,1,1,0,0,1,1,1,0,0,0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i]>0) ? 0 : 1;
            System.out.print(arr[i]+" ");
        }
    }

    // Задание 11:
    static void Array100() {
        System.out.println("\n\nЗадание 11:");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i]+" ");
        }
    }

    // Задание 12:
    static void numberArray() {
        System.out.println("\n\nЗадание 12:");
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i]+" ");
        }
    }

    // Задание 13:
    static void fillDiagonal() {
        System.out.println("\n\nЗадание 13:");
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Задание 14:
    static void justArray(int len, int initialValue) {
        System.out.println("\n\nЗадание 14:");
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i]+" ");
        }
    }
}