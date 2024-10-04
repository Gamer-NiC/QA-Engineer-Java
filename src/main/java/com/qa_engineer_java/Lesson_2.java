package com.qa_engineer_java;

public class Lesson_2 {
   public static void main(String[] args) {

      // Вызов задания 1:
      System.out.println("Задание 1:");
         // Создаём сотрудника
      Сотрудник person1 = new Сотрудник("Alex Kontsevoy", "QA Engineer Java", "AlexKontsevoy@gmail.com", "+123456789", 3000, 30);
         // Выводим информацию о сотруднике
      person1.displayInfoPers();

      // Вызов задания 2:
      System.out.println("\nЗадание 2:");
         // Создаем массив сотрудников
      Сотрудник[] persArray = new Сотрудник[5];
         // Заполняем каждую ячейку массива объектом-сотрудником
      persArray[0] = new Сотрудник("Ivanov Ivan", "Engineer", "IvanovIvan@gmail.com", "892312312", 1500, 31);
      persArray[1] = new Сотрудник("Petrov Petr", "Manager", "PetrovPetr@gmail.com", "892345678", 2000, 35);
      persArray[2] = new Сотрудник("Sidorov Sidor", "Accountant", "SidorovSidor@gmail.com", "892332211", 2500, 40);
      persArray[3] = new Сотрудник("Smirnov Ivan", "Developer", "SmirnovIvan@gmail.com", "892315743", 1000, 27);
      persArray[4] = new Сотрудник("Kuznetsov Alexey", "Designer", "KuznetsovAlexey@gmail.com", "892398765", 1800, 32);
         // Выводим информацию о каждом сотруднике
      for (Сотрудник person : persArray) {
         person.displayInfoPers();
      }

      // Вызов задания 3:
      System.out.println("\nЗадание 3:");
         // Создаем массив аттракционов в классе "Park"
      Park.Attraction[] attractionArr = new Park.Attraction[3];
         // Заполняем каждую ячейку массива объектом-аттракционом
      attractionArr[0] = new Park.Attraction("Американские горки", "10:00", "20:00", 15);
      attractionArr[1] = new Park.Attraction("Карусель", "11:00", "21:00", 10);
      attractionArr[2] = new Park.Attraction("Колесо обозрения", "12:00", "22:00", 13);
         // Выводим информацию о каждом аттракционе
      for (Park.Attraction attractions : attractionArr) {
         attractions.displayInfoPark();
      }
   }

   // Задание 1 и 2:
   static class Сотрудник {
      String fullName;
      String position;
      String email;
      String phoneNumber;
      double salary;
      int age;

      public Сотрудник(String fullName, String position, String email, String phoneNumber, double salary, int age) {
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

   // Задание 3:
   static class Park {

      static class Attraction {
         String attractionName;
         String openingTime;
         String closingTime;
         double cost;

         public Attraction(String attractionName, String openingTime, String closingTime, double cost) {
            this.attractionName = attractionName;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.cost = cost;
         }

         public void displayInfoPark() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время открытия: " + openingTime);
            System.out.println("Время закрытия: " + closingTime);
            System.out.println("Цена: " + cost + "$");
            System.out.println();
         }
      }
   }
}

