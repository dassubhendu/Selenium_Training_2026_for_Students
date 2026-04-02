package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/forgot_password");

        // Identify the text box
        WebElement emailTextBox = driver.findElement(By.name("email"));

        // Whether the email textbox is displayed
        boolean isDisplayedStatus = emailTextBox.isDisplayed();
        System.out.println("is displayed status is: " + isDisplayedStatus);

        // Whether the email textbox is enabled
        boolean isEnabledStatus = emailTextBox.isEnabled();
        System.out.println("is enabled status is: " + isEnabledStatus);

        // Enter value in textbox
        emailTextBox.sendKeys("test@test.com");

        Thread.sleep(3000);

        // Get the value of the text box
        String enteredValue = emailTextBox.getAttribute("value");
        System.out.println("Entered value of text box is: " + enteredValue);

        // Delete the value
        emailTextBox.clear();



    }

}
