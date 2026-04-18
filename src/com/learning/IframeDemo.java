package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/dialog/");
        Thread.sleep(2000);

        // We need to switch into the iFrame before doing any operation on the elements inside it.
        // To switch to an iFrame, we can use it's 'id' or 'name'
        // If 'id' or 'name' is not available, we can use 'index'
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@title='Close']")).click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Demos")).click();
    }

}
