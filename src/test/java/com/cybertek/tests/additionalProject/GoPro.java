package com.cybertek.tests.additionalProject;

import com.cybertek.tests.day5_findElements.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GoPro {
    public static void main(String[] args) {
        // 1. Open a browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.the-leaky-cauldron.org/");

        //WebElement agree = driver.findElement(By.id("onetrust-accept-btn-handler"));
        //agree.click();

        // 2. Create an Array of Headers
        String[] headersOfSite = {"Home", "Potter News", "Potter Crafts", "Potter Essays", "Potter Parks", "About Leaky"};

        // 3. We create a loop of each headers
        // we start from index 0
        for (int i = 0; i < headersOfSite.length; i++) {
            // we are creating a locator.
            driver.findElement(By.linkText(headersOfSite[i])).click();
            // we will get from each page ech title
            System.out.println(driver.getTitle());

            // create the Array list where we can see how much links do we have
            List<WebElement> links = driver.findElements(By.xpath("//body//a"));
            System.out.println("links.size() = " + links.size());

            // we create the ArrayList where we can see how much links with text

            List<WebElement> linksWithText = new ArrayList<>();

            for (WebElement eachLink : links) {

                if (!eachLink.getText().isEmpty()) {

                    linksWithText.add(eachLink);
                }
            }

                System.out.println("Number of links includes \"TEXT\" = " + (linksWithText.size()));
                System.out.println("Number of links missing \"TEXT\" = " + (links.size() - linksWithText.size()));

                System.out.println("==============" + headersOfSite[i] + "================");
            }
        }
    }
