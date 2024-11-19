package com.qa_engineer_java.Lesson_5.Lesson_5_1;

import java.util.*;

public class Main {
   public static void main(String[] args){

      // Создаем ArrayList и добавляем слова
      List<String> words = new ArrayList<>(Arrays.asList(
              "Apple", "Banana", "Lime", "Orange", "Lemon",
              "Banana", "Apple", "Apple", "Apple", "Lemon",
              "Lemon", "Lime", "Apple", "Banana", "Apple",
              "Apple", "Lime", "Banana", "Apple", "Banana"
      ));

      // Используем HashSet для уникальных слов
      Set<String> uniqueWords = new HashSet<String>(words);

      // Используем HashMap для подсчета количества каждого слова
      Map<String, Integer> wordCount = new HashMap<>();
      for (String word : words) {
         wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
      }

      // Выводим уникальные слова и их количество
      System.out.println("Уникальные слова:\n" + uniqueWords);
      System.out.println("\nКоличество слов:");
      for (String word : wordCount.keySet()) {
         System.out.println(word + ": " + wordCount.get(word));
      }
   }
}