package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocatorDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        // This time we want to get all the links in a page by using their tagname
        List<WebElement> allLinks = driver.findElements((By.tagName("a")));
        System.out.println("Total number of links are: " + allLinks.size());

        for(int i = 0; i<allLinks.size();i++){
            System.out.println(allLinks.get(i).getText());
        }

    }

}
