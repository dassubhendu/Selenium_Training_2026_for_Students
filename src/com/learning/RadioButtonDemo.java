package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Identify radio button
        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='male']"));

        // Whether the radio button is displayed
        boolean isDisplayedStatus = maleRadioButton.isDisplayed();
        System.out.println("is displayed status is: " + isDisplayedStatus);

        // Whether the male radio button is enabled
        boolean isEnabledStatus = maleRadioButton.isEnabled();
        System.out.println("is enabled status is: " + isEnabledStatus);

        // Clicking on the radio button to select
        maleRadioButton.click();

        Thread.sleep(3000);

        // Check selected status for the clicked checkbox
        boolean isSelectedStatus = maleRadioButton.isSelected();
        System.out.println("is selected status after click: " + isSelectedStatus);

        // Clicking on the checkbox to un-select
        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='female']"));
        femaleRadioButton.click();


    }

}
