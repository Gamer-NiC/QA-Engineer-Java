package com.qa_engineer_java;

// Класс для исключения размера массива
class MyArraySizeException extends Exception {
   public MyArraySizeException(String message) {
      super(message);
   }
}

// Класс для исключения данных массива
class MyArrayDataException extends Exception {
   public MyArrayDataException(String message) {
      super(message);
   }
}

// Основной класс
public class Lesson_4 {

   // Метод для проверки массива
   public int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

      // Проверяем размер массива 4x4 и соответствие данных типу "int"
      int sum = 0;
      if (4 != array.length) throw new MyArraySizeException("\nРазмер массива должен быть 4 строки.");
      for (int i = 0; i < array.length; i++) {
         if (4 != array[i].length) throw new MyArraySizeException("\nКаждая строка массива должна содержать 4 элемента.");
         for (int j = 0; j < array[i].length; j++) {
            try {
               sum += Integer.parseInt(array[i][j]);
            } catch (NumberFormatException e) {
               throw new MyArrayDataException("\nНеверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
            }
         }
      }
      return sum;
   }

   public static void main(String[] args) {
      Lesson_4 processor = new Lesson_4();

      String[][] validArray = {
              {"1", "2", "3", "4"},
              {"5", "6", "7", "8"},
              {"9", "10", "11", "12"},
              {"13", "14", "15", "16"}
      };

      String[][] invalidSizeArray = {
              {"1", "2", "3", "4"},
              {"5", "6", "7", "8"},
              {"9", "10", "11"},          // Неверный размер
              {"13", "14", "15", "16"}
      };

      String[][] invalidDataArray = {
              {"1", "2", "3", "4"},
              {"5", "6", "seven", "8"},   // Неверное значение
              {"9", "10", "11", "12"},
              {"13", "14", "15", "16"}
      };

      // Вызов метода для правильного массива
      try {
         int result = processor.processArray(validArray);
         System.out.println("\nСумма элементов массива: " + result);
      } catch (MyArraySizeException | MyArrayDataException e) {
         System.err.println(e.getMessage());
      }

      // Вызов метода для массива с неверным размером
      try {
         int result = processor.processArray(invalidSizeArray);
         System.out.println("\nСумма элементов массива: " + result);
      } catch (MyArraySizeException | MyArrayDataException e) {
         System.err.println(e.getMessage());
      }

      // Вызов метода для массива с неверными данными
      try {
         int result = processor.processArray(invalidDataArray);
         System.out.println("\nСумма элементов массива: " + result);
      } catch (MyArraySizeException | MyArrayDataException e) {
         System.err.println(e.getMessage());
      }
   }
}