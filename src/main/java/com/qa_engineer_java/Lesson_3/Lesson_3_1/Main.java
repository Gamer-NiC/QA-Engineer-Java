package com.qa_engineer_java.Lesson_3.Lesson_3_1;

import java.util.Scanner;

// Задание 1:
public class Main {
   public static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {

      // Создаём собак
      Dog dogBobik = new Dog("Бобик");
      Dog dogKrypto = new Dog("Крипто");
      Dog dogScoobyDoo = new Dog("Скуби-Ду");

      // Создаём массив котов
      Cat[] allCats = new Cat[3];
      allCats[0] = new Cat("Мурзик", 10, false);
      allCats[1] = new Cat("Барсик", 15, false);
      allCats[2] = new Cat("Гарфилд", 30, false);

      // Создаём миску с едой
      Bowl bowl = new Bowl(30);

      // Задаём собакам дистанцию бега и плавания
      dogBobik.run(150);
      dogBobik.swim(5);
      dogKrypto.run(500);
      dogKrypto.swim(10);
      dogScoobyDoo.run(300);
      dogScoobyDoo.swim(8);

      // Задаём котам дистанцию бега и плавания, определяем покушали они или нет
      for (Cat cat : allCats) {
         cat.run(100);
         cat.swim(3);
         if (!cat.fullness && cat.appetite < bowl.food){
            cat.eat(bowl);
            cat.fullness = true;
            System.out.println(cat.name + " покушал!\n");
         } else {
            System.out.println(cat.name + " не поел!\n");
         }
      }

      // Выводим иформацию о количестве
      System.out.println("Общее количество животных: " + Animal.getCount());
      System.out.println("Количество собак: " + Dog.getCount());
      System.out.println("Количество котов: " + Cat.getCount());

      // Выводим информацию и добавляем количество еды через консоль
      bowl.info();
      System.out.println("Сколько еды добавить в миску?");
      int action;
      action = sc.nextInt();
      bowl.increaseFood(action);
      bowl.info();
   }
}