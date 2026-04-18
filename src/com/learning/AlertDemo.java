package com.learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);

        Alert al = driver.switchTo().alert();

        String alertText = al.getText();
        System.out.println("Alert text is: " + alertText);

        al.accept();

        //al.dismiss();


    }
}
