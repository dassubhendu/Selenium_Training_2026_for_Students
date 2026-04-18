package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        // Click on link with link text
        //driver.findElement(By.linkText("Meta Store")).click();

        // Click on link with partial link text
        driver.findElement(By.partialLinkText("Store")).click();
    }

}
