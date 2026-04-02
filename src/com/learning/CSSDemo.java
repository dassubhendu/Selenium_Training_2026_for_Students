package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {

    public static void main(String[] args) throws InterruptedException {
        // Some useful sites
        // https://sauce-demo.myshopify.com/account/login
        // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        // https://www.hyrtutorials.com/p/css-selectors-practice.html

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        //Identifying firstname field using css locator with pattern: Tagname & ID
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Subhendu");

        //Identifying gender field using css locator with pattern: Tagname & Class
        //driver.findElement((By.cssSelector("input.gender"))).sendKeys("Male");

        //Identifying lastname field using css locator with pattern: Tagname & Any other attribute
        //driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Das");

        //Identifying lastname field using css locator with pattern: Tagname, id, class and other attribute
        //driver.findElement(By.cssSelector("input.name#lastName[placeholder='Last Name']")).sendKeys("Das");

        // Identifying lastname field using css locator with multiple attribute
        //driver.findElement(By.cssSelector("input[class='name'][id='lastName']")).sendKeys("Das");

        // Identifying lastname field using css locator contains() function
        //driver.findElement(By.cssSelector("input[placeholder*='Last']")).sendKeys("Das");

        // Identifying lastname field using css locator starts-with() function
        driver.findElement(By.cssSelector("input[placeholder^='La']")).sendKeys("Das");

        // Identifying gender field using css locator ends-with() function
        driver.findElement(By.cssSelector("input[placeholder$='der']")).sendKeys("Male");
    }

}
