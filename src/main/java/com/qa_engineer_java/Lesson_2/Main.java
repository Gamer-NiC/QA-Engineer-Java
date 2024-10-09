package com.qa_engineer_java.Lesson_2;

public class Main {
    public static void main(String[] args) {

        // Вызов задания 1:
        System.out.println("Задание 1:");
        // Создаём сотрудника
        Person person1 = new Person("Alex Kontsevoy", "QA Engineer Java", "AlexKontsevoy@gmail.com", "+123456789", 3000, 30);
        // Выводим информацию о сотруднике
        person1.displayInfoPers();

        // Вызов задания 2:
        System.out.println("\nЗадание 2:");
        // Создаем массив сотрудников
        Person[] persArray = new Person[5];
        // Заполняем каждую ячейку массива объектом-сотрудником
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "IvanovIvan@gmail.com", "892312312", 1500, 31);
        persArray[1] = new Person("Petrov Petr", "Manager", "PetrovPetr@gmail.com", "892345678", 2000, 35);
        persArray[2] = new Person("Sidorov Sidor", "Accountant", "SidorovSidor@gmail.com", "892332211", 2500, 40);
        persArray[3] = new Person("Smirnov Ivan", "Developer", "SmirnovIvan@gmail.com", "892315743", 1000, 27);
        persArray[4] = new Person("Kuznetsov Alexey", "Designer", "KuznetsovAlexey@gmail.com", "892398765", 1800, 32);
        // Выводим информацию о каждом сотруднике
        for (Person person : persArray) {
            person.displayInfoPers();
        }

        // Вызов задания 3:
        System.out.println("\nЗадание 3:");
        // Создаем массив аттракционов в классе "Park"
        Park.Attraction[] attractionArr = new Park.Attraction[3];
        // Заполняем каждую ячейку массива объектом-аттракционом
        attractionArr[0] = new Park.Attraction("Американские горки", "10:00", "20:00", 15);
        attractionArr[1] = new Park.Attraction("Карусель", "11:00", "21:00", 10);
        attractionArr[2] = new Park.Attraction("Колесо обозрения", "12:00", "22:00", 13);
        // Выводим информацию о каждом аттракционе
        for (Park.Attraction attractions : attractionArr) {
            attractions.displayInfoPark();
        }
    }
}
