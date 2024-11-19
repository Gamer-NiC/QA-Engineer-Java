package com.qa_engineer_java.Lesson_8.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// iframe_page_url = https://checkout.bepaid.by/widget_v2/index.html
public class PayWindow {

   // Задаём локаторы
   public By bepaidIframe = By.xpath("/html/body/div[8]/div/iframe");

   public By actualTitleSum = By.xpath("//app-payment-container/section/div/div/div[1]/span[1]");
   public By actualTitlePhone = By.xpath("//app-payment-container/section/div/div/div[2]/span");

   public By numberInputName = By.xpath("//app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label");
   public By dateInputName = By.xpath("//app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label");
   public By codeInputName = By.xpath("//app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label");
   public By nameInputName = By.xpath("//app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label");
   public By actualLogos = By.xpath("//div[contains(@class, 'ng-trigger-brandsState')]");

   public By actualButtonSum = By.xpath("//button[@type='submit']");

   private WebDriver driver;

   public PayWindow(WebDriver driver) {
      this.driver = driver;
   }

   // Задаём действия с локаторами
   public String getActualTitleSum() {
      return driver.findElement(actualTitleSum).getText();
   }
   public String getActualTitlePhone() {
      return driver.findElement(actualTitlePhone).getText();
   }
   public String getNumberInputName() {
      return driver.findElement(numberInputName).getText();
   }
   public String getDateInputName() {
      return driver.findElement(dateInputName).getText();
   }
   public String getCodeInputName() {
      return driver.findElement(codeInputName).getText();
   }
   public String getNameInputName() {
      return driver.findElement(nameInputName).getText();
   }
   public String getActualButtonSum() {
      return driver.findElement(actualButtonSum).getText();
   }
   public boolean getActualLogos() {
      return driver.findElements(actualLogos).isEmpty();
   }
}