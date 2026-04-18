package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo{

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();  // Browser launch
        Thread.sleep(3000);
        driver.get("https://www.facebook.com");   // Application launch
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@test.com");

    }

}
