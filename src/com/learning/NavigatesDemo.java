package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatesDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // We can use get() method to launch application
        //driver.get("https://the-internet.herokuapp.com/");

        // Moreover we can use navigate() method as well to launch an application
        driver.navigate().to("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Broken Images")).click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

    }

}
