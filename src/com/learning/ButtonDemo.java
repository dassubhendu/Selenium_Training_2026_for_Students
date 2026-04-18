package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.SysexMessage;

public class ButtonDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
        WebElement addButton = driver.findElement((By.xpath("//button[text()='Add Element']")));
        boolean isDisplayedStatus = addButton.isDisplayed();
        System.out.println("Is displayed status is: " + isDisplayedStatus);
        boolean isEnabledStatus = addButton.isEnabled();
        System.out.println("Is enabled status is: " + isEnabledStatus);
        String nameOfBtn = addButton.getText();
        System.out.println("Name of button is: " + nameOfBtn);
        Thread.sleep(2000);
        addButton.click();
    }

}
