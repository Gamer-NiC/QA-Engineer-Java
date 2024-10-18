package com.qa_engineer_java.Lesson_3.Lesson_3_1;

public class Dog extends Animal {
   private static int dogCount;
   private static final int MAX_RUN_DISTANCE = 500;
   private static final int MAX_SWIM_DISTANCE = 10;

   public static int getCount() {
      return dogCount;
   }

   public Dog(String name) {
      super(name);
      dogCount++;
   }

   @Override
   public void run(int distance) {
      if (distance <= MAX_RUN_DISTANCE) {
         System.out.println(name + " пробежал " + distance + " м.");
      } else {
         System.out.println(name + " не может столько пробежать.");
      }
   }

   @Override
   public void swim(int distance) {
      if (distance <= MAX_SWIM_DISTANCE) {
         System.out.println(name + " проплыл " + distance + " м.\n");
      } else {
         System.out.println(name + " не может столько проплыть.\n");
      }
   }
}