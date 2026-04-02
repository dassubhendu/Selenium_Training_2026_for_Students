package com.learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

    public static void main(String[] args){
        // Selenium 4 onwards no manual driver is needed
        //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

}
