package com.cybertek.tests.HomeWork;

import com.cybertek.tests.day5_findElements.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T02FindElementsApple {

    public static void main(String[] args) {

        //TC #02: FINDELEMENTS_APPLE
        // 1.Open Chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2.Go to https://www.apple.com

        driver.get("https://www.apple.com");

        // 3.Click to iPhone

        WebElement buttomIphone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        buttomIphone.click();

        // 4.Print out the texts of all links

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        int numbersLinkIsMissing = 0;
        int numbersLinkHave = 0;

        for (WebElement each : listOfLinks) {

            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));

        // 5.Print out how many link is missing text

            if (each.getText().isEmpty()) {
                System.out.println(numbersLinkIsMissing++);
                // System.out.println("Links with missing text = " + numbersLinkIsMissing);


                // 6.Print out how many link has text

            }else if (!each.getText().isEmpty()) {
                numbersLinkHave++;
                System.out.println("Link with text = " + each.getText());
            }
        }
        // 7.Print out how many total link
        int numbersOfLinks = listOfLinks.size();
        System.out.println("List of links : " + numbersOfLinks);
    }
}