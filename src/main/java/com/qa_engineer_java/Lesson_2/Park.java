package com.qa_engineer_java.Lesson_2;

// Задание 3:
public class Park {

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