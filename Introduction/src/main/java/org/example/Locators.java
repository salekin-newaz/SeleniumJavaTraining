package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Locators {
    public static void main( String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//BS696//Downloads//chromedriver-win65//chromedriver.exe"); // Update the path to the correct ChromeDriver executable for your operating system
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Salekin");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshetty");
        //driver.findElement(By.id("chkboxOne")).click();
         driver.findElement(By.className("signInBtn")).click();
        //driver.findElement(By.xpath("button[type='submit']")).click();
       sleep(1000);
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Salekin");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("salekin@gmail.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("salekinnewaz0@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("01640836995");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("salekin");
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("#chkboxOne")).click();
        driver.findElement(By.cssSelector("label[for='chkboxTwo']")).click();
        //driver.findElement(By.xpath("button[type='submit']")).click();
        driver.findElement(By.className("signInBtn")).click();
        sleep(5000);
        //


        driver.close();





    }
}
