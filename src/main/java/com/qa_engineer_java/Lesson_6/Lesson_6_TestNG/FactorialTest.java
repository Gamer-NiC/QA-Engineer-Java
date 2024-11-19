package com.qa_engineer_java.Lesson_6.Lesson_6_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

   @Test
   // Проверка что факториал 0 равен 1
   public void testFactorialOfZero() {
      Assert.assertEquals(Factorial.factorial(0), 1);
   }

   @Test
   // Проверка что факториал 5 равен 120 (тест положительного числа)
   public void testFactorialOfPositiveNumber() {
      Assert.assertEquals(Factorial.factorial(5), 120);
   }

   @Test
   // Проверка исключения (тест отрицательного числа)
   public void testFactorialOfNegativeNumber() {
      try {
         Factorial.factorial(-8);
         Assert.fail("Число положительное или 0.");
      } catch (IllegalArgumentException e) {
         // Ожидаемое исключение
      }
   }
}