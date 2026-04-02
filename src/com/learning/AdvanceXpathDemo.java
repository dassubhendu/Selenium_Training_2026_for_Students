package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathDemo {

    public static void main(String[] args){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.get("https://www.facebook.com/");

        // Contains() function example with username
        driver.findElement(By.xpath("//input[contains(@autocomplete, 'username')]")).sendKeys("test@test.com");

        // starts-with() function example password
        driver.findElement((By.xpath("//input[starts-with(@id, '_R_66qjbjb')]"))).sendKeys("12345");

        // text() function [Log in] button
        //driver.findElement((By.xpath("//span[text()='Log in']"))).click();

        // child() function [For Log in] button
        driver.findElement((By.xpath("//div[@role='none']/child::span/child::span[text()='Log in']"))).click();

        // parent() function is just opposite of child() function, just showing an example with Log in button
        //span[text()='Log in']/parent::span

        // following-sibling() with password field
        //input[@name='pass']/following-sibling::label

        // preceding-sibling() with password field
        // label[text()='Password']/preceding-sibling::input

        // and & or operator - example with
        //input[@name='email' and @id='_R_64qjbjb9pb6amH1_']
        //input[@name='email' or @id='_R_64qjbjb9pb6amH1_']






    }

}
