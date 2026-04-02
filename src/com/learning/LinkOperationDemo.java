package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOperationDemo {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Identify Link
        WebElement link = driver.findElement(By.linkText("Online Trainings"));

        // Whether the Link is displayed
        boolean isDisplayedStatus = link.isDisplayed();
        System.out.println("is displayed status is: " + isDisplayedStatus);

        // Whether the Link is enabled
        boolean isEnabledStatus = link.isEnabled();
        System.out.println("is enabled status is: " + isEnabledStatus);

        // Get the link name
        String linkName = link.getText();
        System.out.println("Link name is: " + linkName);

        // click on link
        link.click();


    }


}
