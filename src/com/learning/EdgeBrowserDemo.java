package com.learning;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EdgeBrowserDemo {

    public static void main(String[] args){
        // Selenium 4 onwards no manual driver is needed
        //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        InternetExplorerDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com");
    }

}
