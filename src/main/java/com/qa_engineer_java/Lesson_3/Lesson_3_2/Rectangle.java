package com.qa_engineer_java.Lesson_3.Lesson_3_2;

class Rectangle implements Shape {
   private double width;
   private double length;
   private String fillColor;
   private String borderColor;

   public Rectangle(double width, double length, String fillColor, String borderColor) {
      this.width = width;
      this.length = length;
      this.fillColor = fillColor;
      this.borderColor = borderColor;
   }

   // Формула периметра прямоугольника
   public double calculatePerimeter() {
      return 2 * (width + length);
   }

   // Формула площади прямоугольника
   public double calculateArea() {
      return width * length;
   }

   public String getFillColor() {
      return fillColor;
   }

   public String getBorderColor() {
      return borderColor;
   }
}