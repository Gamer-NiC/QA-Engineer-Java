package com.qa_engineer_java.Lesson_3.Lesson_3_1;

public class Cat extends Animal {
   private static int catCount;
   private static final int MAX_RUN_DISTANCE = 200;
   public int appetite;
   public boolean fullness;

   public static int getCount() {
      return catCount;
   }

   public Cat(String name, int appetite, boolean fullness) {
      super(name);
      this.appetite = appetite;
      this.fullness = fullness;
      catCount++;
   }

   @Override
   public void swim(int distance) {
      System.out.println(name + " не умеет плавать.");
   }

   @Override
   public void run(int distance) {
      if (distance <= MAX_RUN_DISTANCE) {
         System.out.println(name + " пробежал " + distance + " м.");
      } else {
         System.out.println(name + " не может столько пробежать.");
      }
   }

   public void eat(Bowl b) {
      b.decreaseFood(appetite);
   }
}
