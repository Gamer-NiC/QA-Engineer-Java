package com.qa_engineer_java.Lesson_8.Tests;

import com.qa_engineer_java.Lesson_8.Pages.MainPage;
import com.qa_engineer_java.Lesson_8.Pages.PayWindow;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

// Автотесты для сайта MTS.by

// Проверка блока «Онлайн пополнение без комиссии»:
@Epic("Сайт MTS")
@Feature("Блок «Онлайн пополнение без комиссии»")
@Link(name = "МТС.by", url = "https://www.mts.by")
@Owner(value = "Alex Kontsevoy")
class BaseTest {

   private WebDriver driver;
   public WebDriverWait wait;
   private MainPage mainPage;
   private PayWindow payWindow;

   // Действия до тестов
   @BeforeEach
   public void start() {
      driver = new ChromeDriver();
      driver.get("https://www.mts.by");
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

      mainPage = new MainPage(driver);
      payWindow = new PayWindow(driver);

      try {
         // Ожидание появления окна "cookie", чтобы нажать "Принять"
         mainPage.clickCookieAgree();
         wait.withTimeout(java.time.Duration.ofSeconds(1));
      } catch (Exception e) {
         // Если окно "cookie" не отобразилось - продолжаем тесты
      }
   }

   // Тест проверки названия указанного блока
   @Story("Проверка названия указанного блока")
   @DisplayName("Проверка названия указанного блока")
   @Description("Тест проверяет соответствие названия указанного блока")
   @Severity(SeverityLevel.TRIVIAL)
   @Test
   public void testHeaderBlockTitle() {
      String expectedTitle = "Онлайн пополнение\nбез комиссии";
      String actualTitle = mainPage.getActualTitle();
      Assertions.assertEquals(expectedTitle, actualTitle, "Заголовок блока не соответствует ожидаемому");
   }

   // Тест проверки наличия логотипов платёжных систем
   @Story("Проверка наличия логотипов платёжных систем")
   @DisplayName("Проверка наличия логотипов платёжных систем")
   @Description("Тест проверяет наличие логотипов платёжных систем")
   @Severity(SeverityLevel.MINOR)
   @Test
   public void testPaymentSystemLogos() {
      boolean logos = mainPage.getActualLogos();
      Assertions.assertFalse(logos, "Логотипы платёжных систем отсутствуют");
   }

   // Тест проверки работы ссылки «Подробнее о сервисе»
   @Story("Проверка работы ссылки «Подробнее о сервисе»")
   @DisplayName("Проверка работы ссылки «Подробнее о сервисе»")
   @Description("Тест проверяет работу ссылки «Подробнее о сервисе»")
   @Severity(SeverityLevel.NORMAL)
   @Test
   public void testServiceLink() {
      mainPage.clickServiceLink();
      Assertions.assertTrue(driver.getCurrentUrl().contains("www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
   }

   // Тест проверка заполнения полей и работы кнопки «Продолжить»
   @Story("Проверка заполнения полей и работы кнопки «Продолжить»")
   @DisplayName("Проверка заполнения полей и работы кнопки «Продолжить»")
   @Description("Тест проверяет работу полей и кнопки «Продолжить»")
   @Severity(SeverityLevel.CRITICAL)
   @Test
   public void testContinueButton() {
      mainPage
              .clickPayOptions()
              .clickPayOption1()
              .typeConnectionPhone("297777777")
              .typeConnectionSum("38")
              .typeConnectionEmail("QA.Engineer.Java@gmail.com")
              .clickContinue();
   }

   // Тест проверки плейсхолдеров полей "Услиги связи"
   @Story("Проверка плейсхолдеров полей \"Услиги связи\"")
   @DisplayName("Проверка плейсхолдеров полей \"Услиги связи\"")
   @Description("Тест проверяет наличие плейсхолдеров полей \"Услиги связи\"")
   @Severity(SeverityLevel.MINOR)
   @Test
   public void testCommunicationServices() {
      mainPage
              .clickPayOptions()
              .clickPayOption1();

      String[] expectedTitles = {
              "Номер телефона",
              "Сумма",
              "E-mail для отправки чека"
      };
      String[] actualTitles = {
              mainPage.getNameConnectionPhone(),
              mainPage.getNameConnectionSum(),
              mainPage.getNameConnectionEmail()
      };
      for (int i = 0; i < expectedTitles.length; i++) {
         Assertions.assertEquals(expectedTitles[i], actualTitles[i],
                 "Плейсхолдер поля не соответствует ожидаемому" + i);
      }
   }

   // Тест проверки плейсхолдеров полей "Домашний интернет"
   @Story("Проверка плейсхолдеров полей \"Домашний интернет\"")
   @DisplayName("Проверка плейсхолдеров полей \"Домашний интернет\"")
   @Description("Тест проверяет наличие плейсхолдеров полей \"Домашний интернет\"")
   @Severity(SeverityLevel.MINOR)
   @Test
   public void testHomeInternet() {
      mainPage
              .clickPayOptions()
              .clickPayOption2();

      String[] expectedTitles = {
              "Номер абонента",
              "Сумма",
              "E-mail для отправки чека"
      };
      String[] actualTitles = {
              mainPage.getNameInternetPhone(),
              mainPage.getNameInternetSum(),
              mainPage.getNameInternetEmail()
      };
      for (int i = 0; i < expectedTitles.length; i++) {
         Assertions.assertEquals(expectedTitles[i], actualTitles[i],
                 "Плейсхолдер поля не соответствует ожидаемому" + i);
      }
   }

   // Тест проверки плейсхолдеров полей "Рассрочка"
   @Story("Проверка плейсхолдеров полей \"Рассрочка\"")
   @DisplayName("Проверка плейсхолдеров полей \"Рассрочка\"")
   @Description("Тест проверяет наличие плейсхолдеров полей \"Рассрочка\"")
   @Severity(SeverityLevel.MINOR)
   @Test
   public void testInstallmentPlan() {
      mainPage
              .clickPayOptions()
              .clickPayOption3();

      String[] expectedTitles = {
              "Номер счета на 44",
              "Сумма",
              "E-mail для отправки чека"
      };
      String[] actualTitles = {
              mainPage.getNameInstalmentScore(),
              mainPage.getNameInstalmentSum(),
              mainPage.getNameInstalmentEmail()
      };
      for (int i = 0; i < expectedTitles.length; i++) {
         Assertions.assertEquals(expectedTitles[i], actualTitles[i],
                 "Плейсхолдер поля не соответствует ожидаемому" + i);
      }
   }

   // Тест проверки плейсхолдеров полей "Задолженность"
   @Story("Проверка плейсхолдеров полей \"Задолженность\"")
   @DisplayName("Проверка плейсхолдеров полей \"Задолженность\"")
   @Description("Тест проверяет наличие плейсхолдеров полей \"Задолженность\"")
   @Severity(SeverityLevel.MINOR)
   @Test
   public void testDebt() {
      mainPage
              .clickPayOptions()
              .clickPayOption4();

      String[] expectedTitles = {
              "Номер счета на 2073",
              "Сумма",
              "E-mail для отправки чека"
      };
      String[] actualTitles = {
              mainPage.getNameArrearsScore(),
              mainPage.getNameArrearsSum(),
              mainPage.getNameArrearsEmail()
      };
      for (int i = 0; i < expectedTitles.length; i++) {
         Assertions.assertEquals(expectedTitles[i], actualTitles[i],
                 "Плейсхолдер поля не соответствует ожидаемому" + i);
      }
   }

   // Тест проверки окна bePaid
   @Story("Проверка окна bePaid")
   @DisplayName("Проверка окна bePaid")
   @Description("Тест проверяет корректность отображения надписей и лототипов в окне bePaid")
   @Severity(SeverityLevel.NORMAL)
   @Test
   public void testBePaid() {
      // Вводим значения в блок «Онлайн пополнение без комиссии» и нажимаем "Продолжить":
      mainPage.typeConnectionAllInput("297777777", "38", "QA.Engineer.Java@gmail.com");

      // Переключаемся на фрейм
      driver.switchTo().frame(driver.findElement(payWindow.bepaidIframe));
      wait = new WebDriverWait(driver, Duration.ofSeconds(5));

      // Выполняем проверки во фрейме:
      // Провека отображения текста
      String[] expectedTitles = {
              mainPage.getConnectionSum() + ".00 BYN",
              "Оплата: Услуги связи Номер:375" + mainPage.getConnectionPhone(),
              "Номер карты",
              "Срок действия",
              "CVC",
              "Имя держателя (как на карте)",
              "Оплатить " + mainPage.getConnectionSum() + ".00 BYN"
      };
      Supplier<String>[] actualTitles = new Supplier[]{
              payWindow::getActualTitleSum,
              payWindow::getActualTitlePhone,
              payWindow::getNumberInputName,
              payWindow::getDateInputName,
              payWindow::getCodeInputName,
              payWindow::getNameInputName,
              payWindow::getActualButtonSum
      };
      By[] elementsToCheck = {
              payWindow.actualTitleSum,
              payWindow.actualTitlePhone,
              payWindow.numberInputName,
              payWindow.dateInputName,
              payWindow.codeInputName,
              payWindow.nameInputName,
              payWindow.actualButtonSum
      };
      for (int i = 0; i < expectedTitles.length; i++) {
         wait.until(ExpectedConditions.visibilityOfElementLocated(elementsToCheck[i]));
         Assertions.assertEquals(expectedTitles[i], actualTitles[i].get(),
                 "Текст не соответствует ожидаемому" + i);
      }
      // Проверка отображения логотипов
      boolean logos = payWindow.getActualLogos();
      Assertions.assertFalse(logos, "Логотипы платёжных систем отсутствуют");

      // Переключаемся назад на основной сайт
      driver.switchTo().defaultContent();
   }

   // Действия после тестов
   @AfterEach
   public void stop() {
      driver.quit();
      driver = null;
   }
}