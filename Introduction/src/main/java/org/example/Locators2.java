package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Locators2 {
    public static void main( String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//BS696//Downloads//chromedriver-win65//chromedriver.exe"); // Update the path to the correct ChromeDriver executable for your operating system
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password= getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Salekin");
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        String text= "You are successfully logged in.";
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), text);
        driver.findElement(By.cssSelector("button[class='logout-btn']")).click();
        driver.close();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText= driver.findElement(By.cssSelector(".infoMsg")).getText();
        // Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray= passwordText.split("'");
        return passwordArray[1].split("'")[0];
        //driver.close();



    }
}
