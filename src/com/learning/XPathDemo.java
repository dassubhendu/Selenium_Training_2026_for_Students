package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo{

    public static void main(String[] args){

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.get("https://www.facebook.com");

        // What is absolute xpath?
        // Relative xpath
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@test.com");

    }

}
