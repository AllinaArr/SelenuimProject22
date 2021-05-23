package com.cybertek.tests.assigments;

import com.cybertek.tests.day5_findElements.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssigmentsSecond {

    public static void main(String[] args) {
        // 1.Open a browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2.Go to https://qa3.vytrack.com/user/login
        driver.get("https://qa3.vytrack.com/user/login");
        driver.manage().window().maximize();

        WebElement UserName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        UserName.sendKeys("User36");

        WebElement Password = driver.findElement(By.name("_password"));
        Password.sendKeys("UserUser123" + Keys.ENTER );


        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("truck driver account logged in");
        }else {
            System.out.println("Invalid user name/password");
        }
    }
}
