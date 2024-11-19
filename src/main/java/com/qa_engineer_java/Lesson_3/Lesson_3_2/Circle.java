package com.qa_engineer_java.Lesson_3.Lesson_3_2;

class Circle implements Shape {
   private double radius;
   private String fillColor;
   private String borderColor;

   public Circle(double radius, String fillColor, String borderColor) {
      this.radius = radius;
      this.fillColor = fillColor;
      this.borderColor = borderColor;
   }

   // Формула периметра круга
   public double calculatePerimeter() {
      return 2 * Math.PI * radius;
   }

   // Формула площади круга
   public double calculateArea() {
      return Math.PI * radius * radius;
   }

   public String getFillColor() {
      return fillColor;
   }

   public String getBorderColor() {
      return borderColor;
   }
}