package com.qa_engineer_java.Lesson_5.Lesson_5_2;

import java.util.List;

public class Main {
   public static void main(String[] args) {

      // Создание телефонной книги
      PhoneBook phoneBook = new PhoneBook();

      // Добавление записей
      phoneBook.add("Parker", "123-456");
      phoneBook.add("Parker", "789-012");
      phoneBook.add("Parker", "345-678");
      phoneBook.add("Rogers", "901-234");
      phoneBook.add("Rogers", "567-890");
      phoneBook.add("Kontsevoy", "038-830");

      // Поиск номеров по фамилии
      String surnameToSearch = "Parker";
      List<String> phoneNumbers = phoneBook.get(surnameToSearch);
      if (!phoneNumbers.isEmpty()) {
         System.out.println(surnameToSearch + ": " + phoneNumbers);
      } else {
         System.out.println(surnameToSearch + ": номер телефона не найден.");
      }

      // Поиск номеров по фамилии, которой нет в справочнике
      surnameToSearch = "Stark";
      phoneNumbers = phoneBook.get(surnameToSearch);
      if (!phoneNumbers.isEmpty()) {
         System.out.println(surnameToSearch + ": " + phoneNumbers);
      } else {
         System.out.println(surnameToSearch + ": номер телефона не найден.");
      }
   }
}
