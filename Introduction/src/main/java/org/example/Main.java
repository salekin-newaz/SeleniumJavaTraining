package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
// Invoking Browser

        // web drivers method + Class method

// driver object here has access all to all the method of chrome driver

//        System.setProperties("webdriver.chrome.driver", "/Users/BS696/Downloads/chrome-win64/chrome.exe");
//        ChromeDriver driver= new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C://Users//BS696//Downloads//chromedriver-win64//chromedriver.exe"); // Update the path to the correct ChromeDriver executable for your operating system
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        driver.close();
        // close current window
        //driver.quit();
        //close driver all associated window

    }
}