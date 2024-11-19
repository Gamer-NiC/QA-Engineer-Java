package com.qa_engineer_java.Lesson_6.Lesson_6_JUnit_5;

public class Factorial {
   public static int factorial(int n) {

      // Вычисление факториала
      if (n < 0) {
         throw new IllegalArgumentException("Число должно быть неотрицательным.");
      }
      int result = 1;
      for (int i = 1; i <= n; i++) {
         result *= i;
      }
      return result;
   }

   public static void main(String[] args) {

      // Калькулятор вычисления факториала
      int number = 8; // Можно указать любое число для вычисления его факториала
      System.out.println("Факториал числа " + number + " равен: " + factorial(number));
   }
}