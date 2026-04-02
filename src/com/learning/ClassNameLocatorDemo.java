package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassNameLocatorDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://proleed.academy/exercises/selenium/selenium-element-locators-practice-form.php");

        Thread.sleep(5000);

        // Capturing all text boxes in facebook by using findElements() function and List.
        List<WebElement> allTextBoxes = driver.findElements(By.className("form-control"));
        System.out.println("Total textboxes are: " + allTextBoxes.size());

        // Now if I want to enter Full name
        allTextBoxes.get(0).sendKeys("test@test.com");
        allTextBoxes.get(1).sendKeys("12345");

        Thread.sleep(5000);


    }

}
