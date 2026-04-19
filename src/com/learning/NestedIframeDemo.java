package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        Thread.sleep(2000);

        // Switch from HTML page to parent iFrame
        driver.switchTo().frame("frame-top");
        Thread.sleep(2000);

        // Switch from HTML page to child iFrame
        driver.switchTo().frame("frame-middle");
        Thread.sleep(2000);

        // Getting text of the element resides inside child iFrame
        String childFrameText = driver.findElement(By.id("content")).getText();
        System.out.println("Name of the child iFrame: " + childFrameText);

        // Come out from child iFrame
        driver.switchTo().parentFrame();

        // Come out from parent iFrame
        driver.switchTo().defaultContent();
    }

}
