package com.qa_engineer_java.Lesson_2;

// Задание 1 и 2:
public class Person {
   String fullName;
   String position;
   String email;
   String phoneNumber;
   double salary;
   int age;

   public Person(String fullName, String position, String email, String phoneNumber, double salary, int age) {
      this.fullName = fullName;
      this.position = position;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.salary = salary;
      this.age = age;
   }

   public void displayInfoPers() {
      System.out.println("ФИО: " + fullName);
      System.out.println("Должность: " + position);
      System.out.println("Email: " + email);
      System.out.println("Номер телефона: " + phoneNumber);
      System.out.println("Зарплата: " + salary + "$");
      System.out.println("Возраст: " + age);
      System.out.println();
   }
}