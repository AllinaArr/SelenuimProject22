package com.cybertek.tests.HomeWork;

import com.cybertek.tests.day5_findElements.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T0FindElements {
    public static void main(String[] args) {

        // 1.Open Chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2.Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");

        // 3.Print out the texts of all links
        //WE NEED TO CREATE A LOCATOR THAT RETURNS US ALL THE LINKS ON THE PAGE
        //body//a ---> This locator will return all of the links on the page
        //we are storing all of the links that are returned by findElements method
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement each : listOfLinks) {

            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }

//        int numberOfLinks = listOfLinks.size();
//        System.out.println("Number of Links = " + numberOfLinks);

        // 4.Print out how many link is missing text

        int numbersIsMissing = 0;
        int countText = 0;
        for (WebElement each : listOfLinks) {

            if (each.getText().isEmpty()) {
                numbersIsMissing++;
                System.out.println("Number of link where is missing text: " + numbersIsMissing);

                // 5.Print out how many link has text
            } else if (!each.getText().isEmpty()) {
                countText++;
                System.out.println("Number of link where we have texts: " + each.getText());
            }
        }
        // 6.Print out how many total link

        int numberOfLinks = listOfLinks.size();
        System.out.println("Number of Links = " + numberOfLinks);


    }
}
