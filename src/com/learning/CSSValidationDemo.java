package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSValidationDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/forgot_password");
        Thread.sleep(2000);

        WebElement forgotButton = driver.findElement(By.id("form_submit"));

        String borderStyle = forgotButton.getCssValue("border-style");
        System.out.println("Border style value is: " + borderStyle);
        String textAlignment = forgotButton.getCssValue("text-align");
        System.out.println("Text alignment value is: " + textAlignment);

        // https://www.w3schools.com/colors/colors_rgb.asp [RGB color specification]
        String backgroundColorOfBtn = forgotButton.getCssValue("background-color");
        System.out.println("Background color code is: " + backgroundColorOfBtn);

    }

}
