package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.desktop.SystemEventListener;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Identify drop down element
        WebElement countryDropDown = driver.findElement(By.id("country"));

        // Select a value from list
        Select selectCountry = new Select(countryDropDown);

        // 1st way: Select by index [Starts from 0]
        selectCountry.selectByIndex(2);
        Thread.sleep(2000);

        // 2nd way: Select by value
        selectCountry.selectByValue("germany");
        Thread.sleep(2000);

        // 3rd way: Select by visible text
        selectCountry.selectByVisibleText("China");

        // Get selected value from the drop down
        WebElement selectedOption = selectCountry.getFirstSelectedOption();
        String selectedDropDownValue = selectedOption.getText();
        System.out.println("Selected value in drop dwon is: " + selectedDropDownValue);

    }

}
