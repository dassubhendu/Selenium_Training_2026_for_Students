package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocatorDemo {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        // Enter email id with id locator
        driver.findElement(By.id("_R_64qjbjb9pb6amH1_")).sendKeys("test@test.com");
        Thread.sleep(3000);
        // Enter password with name locator
        driver.findElement(By.name("pass")).sendKeys("12345");
    }

}
