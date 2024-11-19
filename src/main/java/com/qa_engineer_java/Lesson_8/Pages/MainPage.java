package com.qa_engineer_java.Lesson_8.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// page_url = https://www.mts.by/
public class MainPage {

    // Задаём локаторы
    public By cookieAgree = By.xpath("//*[@id='cookie-agree']");

    public By actualTitle = By.xpath("//*[@id=\"pay-section\"]//h2");
    public By actualLogos = By.xpath("//*[@id=\"pay-section\"]//ul");
    public By serviceLink = By.xpath("//*[@id=\"pay-section\"]//a");

    public By payOptionsButton = By.xpath("//*[@id=\"pay-section\"]//button");
    public By selectPayOption1 = By.xpath("//*[@id=\"pay-section\"]//li[1]/p");
    public By selectPayOption2 = By.xpath("//*[@id=\"pay-section\"]//li[2]/p");
    public By selectPayOption3 = By.xpath("//*[@id=\"pay-section\"]//li[3]/p");
    public By selectPayOption4 = By.xpath("//*[@id=\"pay-section\"]//li[4]/p");

    public By connectionPhoneInput = By.xpath("//*[@id=\"connection-phone\"]");
    public By connectionSumInput = By.xpath("//*[@id=\"connection-sum\"]");
    public By connectionEmailInput = By.xpath("//*[@id=\"connection-email\"]");

    public By internetPhoneInput = By.xpath("//*[@id=\"internet-phone\"]");
    public By internetSumInput = By.xpath("//*[@id=\"internet-sum\"]");
    public By internetEmailInput = By.xpath("//*[@id=\"internet-email\"]");

    public By instalmentScoreInput = By.xpath("//*[@id=\"score-instalment\"]");
    public By instalmentSumInput = By.xpath("//*[@id=\"instalment-sum\"]");
    public By instalmentEmailInput = By.xpath("//*[@id=\"instalment-email\"]");

    public By arrearsScoreInput = By.xpath("//*[@id=\"score-arrears\"]");
    public By arrearsSumInput = By.xpath("//*[@id=\"arrears-sum\"]");
    public By arrearsEmailInput = By.xpath("//*[@id=\"arrears-email\"]");

    public By continueButton = By.xpath("//*[@id=\"pay-connection\"]/button");

    private WebDriver driver;
    private String connectionPhone;
    private String connectionSum;
    private String connectionEmail;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Задаём действия с локаторами
    public MainPage clickCookieAgree() {
        driver.findElement(cookieAgree).click();
        return this;
    }
    public String getActualTitle() {
        return driver.findElement(actualTitle).getText();
    }
    public boolean getActualLogos() {
        return driver.findElements(actualLogos).isEmpty();
    }
    public MainPage clickServiceLink() {
        driver.findElement(serviceLink).click();
        return this;
    }
    public MainPage clickPayOptions() {
        driver.findElement(payOptionsButton).click();
        return this;
    }
    public MainPage clickPayOption1() {
        driver.findElement(selectPayOption1).click();
        return this;
    }
    public MainPage clickPayOption2() {
        driver.findElement(selectPayOption2).click();
        return this;
    }
    public MainPage clickPayOption3() {
        driver.findElement(selectPayOption3).click();
        return this;
    }
    public MainPage clickPayOption4() {
        driver.findElement(selectPayOption4).click();
        return this;
    }
    public MainPage typeConnectionPhone(String connectionPhone) {
        driver.findElement(connectionPhoneInput).sendKeys(connectionPhone);
        return this;
    }
    public MainPage typeConnectionSum(String connectionSum) {
        driver.findElement(connectionSumInput).sendKeys(connectionSum);
        return this;
    }
    public MainPage typeConnectionEmail(String connectionEmail) {
        driver.findElement(connectionEmailInput).sendKeys(connectionEmail);
        return this;
    }
    public String getNameConnectionPhone() {
        return driver.findElement(connectionPhoneInput).getAttribute("placeholder");
    }
    public String getNameConnectionSum() {
        return driver.findElement(connectionSumInput).getAttribute("placeholder");
    }
    public String getNameConnectionEmail() {
        return driver.findElement(connectionEmailInput).getAttribute("placeholder");
    }
    public MainPage typeInternetPhone(String internetPhone) {
        driver.findElement(internetPhoneInput).sendKeys(internetPhone);
        return this;
    }
    public MainPage typeInternetSum(String internetSum) {
        driver.findElement(internetSumInput).sendKeys(internetSum);
        return this;
    }
    public MainPage typeInternetEmail(String internetEmail) {
        driver.findElement(internetEmailInput).sendKeys(internetEmail);
        return this;
    }
    public String getNameInternetPhone() {
        return driver.findElement(internetPhoneInput).getAttribute("placeholder");
    }
    public String getNameInternetSum() {
        return driver.findElement(internetSumInput).getAttribute("placeholder");
    }
    public String getNameInternetEmail() {
        return driver.findElement(internetEmailInput).getAttribute("placeholder");
    }
    public MainPage typeInstalmentScore(String instalmentScore) {
        driver.findElement(instalmentScoreInput).sendKeys(instalmentScore);
        return this;
    }
    public MainPage typeInstalmentSum(String instalmentSum) {
        driver.findElement(instalmentSumInput).sendKeys(instalmentSum);
        return this;
    }
    public MainPage typeInstalmentEmail(String instalmentEmail) {
        driver.findElement(instalmentEmailInput).sendKeys(instalmentEmail);
        return this;
    }
    public String getNameInstalmentScore() {
        return driver.findElement(instalmentScoreInput).getAttribute("placeholder");
    }
    public String getNameInstalmentSum() {
        return driver.findElement(instalmentSumInput).getAttribute("placeholder");
    }
    public String getNameInstalmentEmail() {
        return driver.findElement(instalmentEmailInput).getAttribute("placeholder");
    }
    public MainPage typeArrearsScore(String arrearsScore) {
        driver.findElement(arrearsScoreInput).sendKeys(arrearsScore);
        return this;
    }
    public MainPage typeArrearsSum(String arrearsSum) {
        driver.findElement(arrearsSumInput).sendKeys(arrearsSum);
        return this;
    }
    public MainPage typeArrearsEmail(String arrearsEmail) {
        driver.findElement(arrearsEmailInput).sendKeys(arrearsEmail);
        return this;
    }
    public String getNameArrearsScore() {
        return driver.findElement(arrearsScoreInput).getAttribute("placeholder");
    }
    public String getNameArrearsSum() {
        return driver.findElement(arrearsSumInput).getAttribute("placeholder");
    }
    public String getNameArrearsEmail() {
        return driver.findElement(arrearsEmailInput).getAttribute("placeholder");
    }
    public MainPage clickContinue() {
        driver.findElement(continueButton).click();
        return this;
    }
    public void typeConnectionAllInput (String connectionPhone, String connectionSum, String connectionEmail) {
        this.connectionPhone = connectionPhone;
        this.connectionSum = connectionSum;
        this.connectionEmail = connectionEmail;
        clickPayOptions();
        clickPayOption1();
        typeConnectionPhone(connectionPhone);
        typeConnectionSum(connectionSum);
        typeConnectionEmail(connectionEmail);
        clickContinue();
    }
    public String getConnectionPhone() {
        return connectionPhone;
    }
    public String getConnectionSum() {
        return connectionSum;
    }
    public String getConnectionEmail() {
        return connectionEmail;
    }
}