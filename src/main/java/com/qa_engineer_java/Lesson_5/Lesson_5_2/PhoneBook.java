package com.qa_engineer_java.Lesson_5.Lesson_5_2;

import java.util.*;

class PhoneBook {

   public Map<String, List<String>> contacts;

   public PhoneBook() {
      contacts = new HashMap<>();
   }

   // Метод для добавления записи
   public void add(String surname, String phoneNumber) {
      contacts.putIfAbsent(surname, new ArrayList<>());
      contacts.get(surname).add(phoneNumber);
   }

   // Метод для получения номеров по фамилии
   public List<String> get(String surname) {
      return contacts.getOrDefault(surname, Collections.emptyList());
   }
}
