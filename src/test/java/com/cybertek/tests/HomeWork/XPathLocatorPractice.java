package com.cybertek.tests.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocatorPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        driver.manage().window().maximize();

        WebElement buttonFirst = driver.findElement(By.xpath("//button[@onclick='button1()']"));

        buttonFirst.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedText = "Clicked on button one!";
        String actualText = resultText.getText();

        if (actualText.equals(expectedText)) {
            System.out.println("Result text verification PASSED!");
        } else {
            System.out.println("Result text verification FAILED!!!");
        }
    }
}

