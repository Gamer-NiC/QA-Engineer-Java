package com.qa_engineer_java.Lesson_3.Lesson_3_2;

// Задание 2:
public class Main {
   public static void main(String[] args) {

      // Создаём круг и выводим информацию в консоль
      Circle circle = new Circle(5, "Красный", "Чёрный");
      System.out.println("\nПериметр круга: " + circle.calculatePerimeter());
      System.out.println("Площадь круга: " + circle.calculateArea());
      System.out.println("Цвет заливки: " + circle.getFillColor());
      System.out.println("Цвет границы: " + circle.getBorderColor());

      // Создаём прямоугольник и выводим информацию в консоль
      Rectangle rectangle = new Rectangle(3, 8, "Белый", "Зелёный");
      System.out.println("\nПериметр прямоугольника: " + rectangle.calculatePerimeter());
      System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
      System.out.println("Цвет заливки: " + rectangle.getFillColor());
      System.out.println("Цвет границы: " + rectangle.getBorderColor());

      // Создаём треугольник и выводим информацию в консоль
      Triangle triangle = new Triangle(3, 4, 5, "Жёлтый", "Синий");
      System.out.println("\nПериметр Треугольника: " + triangle.calculatePerimeter());
      System.out.println("Площадь треугольника: " + triangle.calculateArea());
      System.out.println("Цвет заливки: " + triangle.getFillColor());
      System.out.println("Цвет границы: " + triangle.getBorderColor());
   }
}