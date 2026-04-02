package com.learning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {

    public static void main(String[] args){
        // Selenium 4 onwards no manual driver is needed
        //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }

}
