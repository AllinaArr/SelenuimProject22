package com.cybertek.tests.HomeWork;

import com.cybertek.tests.day5_findElements.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SecondWayOfFindElements {
    public static void main(String[] args) {

        // 1. Open Browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // we created the array of each headers on the website
        String [] headers = {"Mac", "iPad", "iPhone", "Watch", "TV", "Music", "Support"};


        for (int i = 0; i <headers.length; i++) {
            // //a[contains(@class,'mac')]
            driver.findElement(By.xpath("//a[contains(@class,'"+headers[i].toLowerCase() +"')]")).click();
            System.out.println(driver.getTitle());
            //Thread.sleep(3000);
            List<WebElement> links = driver.findElements(By.xpath("//body//a"));
            System.out.println("links.size() = " + links.size());

            List<WebElement> linksWithText = new ArrayList<>();

            for (WebElement eachLink : links) {
                if (!eachLink.getText().isEmpty()) {
                    linksWithText.add(eachLink);
                }
            }
            System.out.println("Number of links includes \"TEXT\" = " + (linksWithText.size()));
            System.out.println("Number of links missing \"TEXT\" = " + (links.size() - linksWithText.size()));

            System.out.println("=============="+headers[i]+"================");
        }
    }
}
