package com.qa_engineer_java.Lesson_6.Lesson_6_JUnit_5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactorialTest {

   @Test
   // Проверка что факториал 0 равен 1
   public void testFactorialOfZero() {
      assertEquals(1, Factorial.factorial(0));
   }

   @Test
   // Проверка что факториал 5 равен 120 (тест положительного числа)
   public void testFactorialOfPositiveNumber() {
      assertEquals(120, Factorial.factorial(5));
   }

   @Test
   // Проверка исключения (тест отрицательного числа)
   public void testFactorialOfNegativeNumber() {
      try {
         Factorial.factorial(-8);
         fail("Число положительное или 0.");
      } catch (IllegalArgumentException e) {
         // Ожидаемое исключение
      }
   }
}