package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.goibibo.com/flights/");

        Thread.sleep(2000);

        // Closing the signup/login portal
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/span/span")).click();

        // ********* Departure Date Selection **********
        // Click on the departure calendar dropdown button
        WebElement depCalendarIcon = driver.findElement(By.xpath("//input[@id='departure']/preceding-sibling::span"));
        depCalendarIcon.click();

        Thread.sleep(2000);

        // Now targeting to select today's date
        WebElement toDayDate = driver.findElement(By.xpath("//div[contains(@class,'today')]"));
        toDayDate.click();

        Thread.sleep(4000);

        // ********* Return Date Selection **********
        // Click on the return calendar dropdown button
        // Important: For this button we have taken run time xpath
        WebElement retCalendarIcon = driver.findElement(By.xpath("//span[contains(text(), 'Return')]"));
        retCalendarIcon.click();

        Thread.sleep(2000);

        // Let us select return date from next month, so we need to click on the next button for getting next month calendar
        WebElement nextMonthButton = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
        nextMonthButton.click();

        // Now targeting to select today's date
        WebElement nextMonthFirstDat = driver.findElement(By.xpath("//div[@aria-label='Fri May 01 2026']"));
        nextMonthFirstDat.click();

        Thread.sleep(2000);

    }

}
