package com.qa_engineer_java.Lesson_3.Lesson_3_2;

class Triangle implements Shape {
   private double side1;
   private double side2;
   private double side3;
   private String fillColor;
   private String borderColor;

   public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
      this.fillColor = fillColor;
      this.borderColor = borderColor;
   }

   // Формула периметра треугольника
   public double calculatePerimeter() {
      return side1 + side2 + side3;
   }

   // Формула площади треугольника
   public double calculateArea() {
      double s = (side1 + side2 + side3) / 2;
      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
   }

   public String getFillColor() {
      return fillColor;
   }

   public String getBorderColor() {
      return borderColor;
   }
}
