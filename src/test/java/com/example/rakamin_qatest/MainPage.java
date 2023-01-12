package com.example.rakamin_qatest;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

// page_url = https://web-staging.rakamin.com/
public class MainPage {
    public MainPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[2]/button[1]")
    public WebElement login;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[1]/div[2]/div/input")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[2]/div[2]/div/input")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[4]/button")
    public WebElement masuk;

    @FindBy(xpath = "/html/body/div/div[1]/div/a/img")
    public WebElement icon_rakamin;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[1]/div[1]")
    public WebElement navbar_courses;

    @FindBy(xpath = "/html/body/div/div[3]/div[2]/div[2]/div/div[1]/div[1]/div/div[1]/p[1]")
    public WebElement course_test;

    @FindBy(xpath = "/html/body/div/div[3]/aside/a/button")
    public WebElement ikut_kelas;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/button[2]")
    public WebElement lanjut_bayar;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/p")
    public WebElement text_success;

    @Step("Login")
    public MainPage btn_Login() throws InterruptedException {
        login.click();
        Thread.sleep(2000);
        return this;
    }

    @Step("As a User, I input a sentence in the email field")
    public MainPage inputEmail() throws InterruptedException {
        email.sendKeys("hi.arumpuspa@gmail.com");
        Thread.sleep(2000);
        return this;
    }

    @Step("As a User, I input a sentence in the password field")
    public MainPage inputPass() throws InterruptedException {
        password.sendKeys("Missu077_");
        Thread.sleep(2000);
        return this;
    }

    @Step("Masuk")
    public MainPage btn_Masuk() throws InterruptedException {
        masuk.click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Logo")
    public MainPage btn_Icon() throws InterruptedException {
        icon_rakamin.click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Course")
    public MainPage btn_CourseNavbar() throws InterruptedException {
        navbar_courses.click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Course Test")
    public MainPage btn_CourseTest() throws InterruptedException {
        course_test.click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Ikut Kelas")
    public MainPage btn_IkutKelas() throws InterruptedException {
        ikut_kelas.click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Lanjut Bayar")
    public MainPage btn_LanjutBayar() throws InterruptedException {
        lanjut_bayar.click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Assert")
    public MainPage testAssert() throws InterruptedException {
        String ActualStatus = text_success.getText();
        String ExpectedStatus = "Terima kasih atas pembelian Test With Dio Free Class";
        Assert.assertEquals(ActualStatus,ExpectedStatus);
        System.out.println("Succes: "+ ActualStatus);
        Thread.sleep(2000);
        return this;
    }


}
