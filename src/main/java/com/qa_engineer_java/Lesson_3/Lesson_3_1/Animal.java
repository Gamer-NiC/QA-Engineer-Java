package com.qa_engineer_java.Lesson_3.Lesson_3_1;

public class Animal {
   protected static int count;
   protected String name;

   public Animal(String name) {
      this.name = name;
      count++;
   }

   public void run(int distance) {}

   public void swim(int distance) {}

   public static int getCount() {
      return count;
   }
}