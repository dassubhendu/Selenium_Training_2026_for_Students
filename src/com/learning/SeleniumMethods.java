package com.learning;

import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class SeleniumMethods {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");

        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is: " + pageTitle);

        String pageCurrentURL = driver.getCurrentUrl();
        System.out.println("The current URL is: " + pageCurrentURL);

    }

}
