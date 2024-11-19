package com.qa_engineer_java;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

// Автотесты для сайта MTS.by

// Проверка блока «Онлайн пополнение без комиссии»:
public class Lesson_7 {
   public WebDriver driver = new ChromeDriver();

   // Действия до тестов
   @BeforeEach
   public void start() {
      driver.get("https://www.mts.by");
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

      // Нажимаем кнопку "Принять" cookie
      WebElement cookie = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
      cookie.click();
   }

   // Тест проверки названия указанного блока
   @DisplayName("Проверка названия указанного блока")
   @Test
   public void testHeaderBlockTitle() {
      String expectedTitle = "Онлайн пополнение\nбез комиссии";
      WebElement actualTitle = driver.findElement(By.xpath("//*[@id=\"pay-section\"]//h2"));
      actualTitle.getText();
      Assertions.assertEquals(expectedTitle, actualTitle.getText(), "Заголовок блока не соответствует ожидаемому");
   }

   // Тест проверки наличия логотипов платёжных систем
   @DisplayName("Проверка наличия логотипов платёжных систем")
   @Test
   public void testPaymentSystemLogos() {
      List<WebElement> logos = driver.findElements(By.xpath("//*[@id=\"pay-section\"]//ul"));
      Assertions.assertFalse(logos.isEmpty(), "Логотипы платёжных систем отсутствуют");
   }

   // Тест проверки работы ссылки «Подробнее о сервисе»
   @DisplayName("Проверка работы ссылки «Подробнее о сервисе»")
   @Test
   public void testServiceLink() {
      WebElement serviceLink = driver.findElement(By.xpath("//*[@id=\"pay-section\"]//a"));
      serviceLink.click();
      Assertions.assertTrue(driver.getCurrentUrl().contains("www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
   }

   // Тест проверка заполнения полей и работы кнопки «Продолжить»
   @DisplayName("Проверка заполнения полей и работы кнопки «Продолжить»")
   @Test
   public void testContinueButton() {
      WebElement serviceDropdown = driver.findElement(By.xpath("//*[@id=\"pay-section\"]//button"));
      WebElement selectOption = driver.findElement(By.xpath("//*[@id=\"pay-section\"]//li[1]/p"));
      WebElement phone = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
      WebElement sum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
      WebElement email = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
      WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));

      // Выбираем опцию "Услуги связи"
      serviceDropdown.click();
      selectOption.click();

      // Вводим данные в поля
      phone.sendKeys("297777777");
      sum.sendKeys("38");
      email.sendKeys("QA.Engineer.Java@gmail.com");

      // Нажимаем кнопку "Продолжить"
      continueButton.click();
   }

   // Действия после тестов
   @AfterEach
   public void stop() {
      driver.quit();
      driver = null;
   }
}
