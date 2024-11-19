package com.qa_engineer_java.Lesson_3.Lesson_3_1;

public class Bowl {
   public int food;

   public Bowl(int food) {
      this.food = food;
   }

   public void decreaseFood(int a) {
      food -= a;
   }

   public void increaseFood(int x) {
      food += x;
   }

   public void info() {
      System.out.println("\nКоличество еды в миске: " + food);
   }
}