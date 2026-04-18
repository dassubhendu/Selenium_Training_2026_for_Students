package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingBrowserDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        JavascriptExecutor js = driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        driver.findElement(By.linkText("Elemental Selenium")).click();

        Thread.sleep(3000);
        driver.close();

        Thread.sleep(3000);
        driver.quit();

    }

}
