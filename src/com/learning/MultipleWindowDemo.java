package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWindowDemo {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/windows");
        Thread.sleep(2000);

        // After clicking on this link a new tab will be opened
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Thread.sleep(2000);

        // Getting the window ID for parent tab by using windowHandle()
        String firstTabWindow = driver.getWindowHandle();
        System.out.println("First TAB window ID is: " + firstTabWindow);

        // Now when we have multiple tabs opened, we need to get all window IDs
        Set<String> allWindowIds = driver.getWindowHandles();

        // Now iterate through this Set variable 'allWindowIds' and if you find any ID not matching parent window id then switch to that
        for(String s: allWindowIds){
            if(!s.equals(firstTabWindow)){
                driver.switchTo().window(s);
            }
        }

        Thread.sleep(2000);

        // Now after switching to the next tab, we can do operations on any element belongs to second tab
        String secondTabText = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
        System.out.println("Second tab text value: " + secondTabText);

        // Now we need to switch focus from second tab to first / parent tab
        driver.switchTo().window(firstTabWindow);
        Thread.sleep(2000);

        // Now clicking on a link in First Tab
        driver.findElement(By.xpath("//*[@id='page-footer']/div/div/a")).click();
        Thread.sleep(2000);

    }

}
