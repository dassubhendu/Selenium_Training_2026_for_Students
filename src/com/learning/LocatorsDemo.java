package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        // Difference between findelement() and findelements() functions.
        // Identify single text box
        // Change the value of locator so that we will get 'no such element exception'
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("Selenium");

        // Now we are using findelements() function to get list of elements
        // We are identifying all the links
        // findelements() functions does not throw no such element exception, instead it would return empty list
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links are: " + allLinks.size());



    }
}
