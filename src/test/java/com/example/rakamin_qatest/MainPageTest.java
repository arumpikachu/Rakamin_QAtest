package com.example.rakamin_qatest;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;
    private com.example.rakamin_qatest.MainPage mainPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://web-staging.rakamin.com/");

        mainPage = new com.example.rakamin_qatest.MainPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Test() throws InterruptedException {
        mainPage.btn_Login().inputEmail().inputPass().btn_Masuk().btn_Icon().btn_CourseNavbar().btn_CourseTest().btn_IkutKelas().btn_LanjutBayar().testAssert();
    }

}
