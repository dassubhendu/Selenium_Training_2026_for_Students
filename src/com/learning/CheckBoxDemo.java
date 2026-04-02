package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        // Identify Checkbox
        WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        // Whether the checkbox1 is displayed
        boolean isDisplayedStatus = checkBox1.isDisplayed();
        System.out.println("is displayed status is: " + isDisplayedStatus);

        // Whether the email textbox is enabled
        boolean isEnabledStatus = checkBox1.isEnabled();
        System.out.println("is enabled status is: " + isEnabledStatus);

        // Clicking on the checkbox to select
        checkBox1.click();

        Thread.sleep(3000);

        // Check selected status for the clicked checkbox
        boolean isSelectedStatus = checkBox1.isSelected();
        System.out.println("is selected status after click: " + isSelectedStatus);

        // Clicking on the checkbox to un-select
        checkBox1.click();
    }

}
