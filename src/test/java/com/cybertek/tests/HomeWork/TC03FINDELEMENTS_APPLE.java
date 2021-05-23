package com.cybertek.tests.HomeWork;

import com.cybertek.tests.day5_findElements.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC03FINDELEMENTS_APPLE {
    public static void main(String[] args) {
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to all of the headers one by onea.
        // 4.Print out the titles of the each page
        // Mac,
        WebElement buttomMac = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']"));
        buttomMac.click();
        List<WebElement> listOfLinksMac = driver.findElements(By.xpath("//body//a"));
        System.out.println("List of links (Mac): " + listOfLinksMac.size());

        int numbersLinkIsMissingMac = 0;
        int numbersLinkHaveMac = 0;
        for (WebElement eachMac : listOfLinksMac) {
            if (eachMac.getText().isEmpty()) {
                System.out.println(numbersLinkIsMissingMac++);
                // System.out.println("Links with missing text = " + numbersLinkIsMissing);
            } else if (!eachMac.getText().isEmpty()) {
                numbersLinkHaveMac++;
                System.out.println("Link with text = " + eachMac.getText());

                // iPad, ac-gn-link ac-gn-link-ipad
                WebElement buttomPad = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-ipad']"));
                buttomPad.click();
                List<WebElement> listOfLinksPad = driver.findElements(By.xpath("//body//a"));
                System.out.println("List of links (Pad): " + listOfLinksPad.size());
                /**
                 for (WebElement each : listOfLinksPad) {
                 System.out.println(each.getText());
                 System.out.println(each.getAttribute("href"));
                 }

                 */
                // iPhone,
                WebElement buttomIphone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
                buttomIphone.click();
                List<WebElement> listOfLinksIphone = driver.findElements(By.xpath("//body//a"));
                System.out.println("List of links (Iphone): " + listOfLinksIphone.size());
                /**          for (WebElement each : listOfLinksIphone) {
                 System.out.println(each.getText());
                 System.out.println(each.getAttribute("href"));
                 }
                 */

                // Watch,
                WebElement buttomWatch = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-watch']"));
                buttomWatch.click();
                List<WebElement> listOfLinksWatch = driver.findElements(By.xpath("//body//a"));
                System.out.println("List of links (Watch): " + listOfLinksWatch.size());

                /**   for (WebElement each : listOfLinksWatch) {
                 System.out.println(each.getText());
                 System.out.println(each.getAttribute("href"));
                 }

                 */
                // TV,
                WebElement buttomTV = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-tv']"));
                buttomTV.click();
                List<WebElement> listOfLinksTV = driver.findElements(By.xpath("//body//a"));
                System.out.println("List of links (TV): " + listOfLinksTV.size());

                /** for (WebElement each : listOfLinksTV) {
                 System.out.println(each.getText());
                 System.out.println(each.getAttribute("href"));
                 }
                 */
                // Music,
                WebElement buttomMusic = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-music']"));
                buttomMusic.click();
                List<WebElement> listOfLinksMusic = driver.findElements(By.xpath("//body//a"));
                System.out.println("List of links (Music): " + listOfLinksMusic.size());
                /**
                 for (WebElement each : listOfLinksMusic) {
                 System.out.println(each.getText());
                 System.out.println(each.getAttribute("href"));
                 }
                 */
                // Support
                WebElement buttomSupport = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-support']"));
                buttomSupport.click();
                List<WebElement> listOfLinksSupport = driver.findElements(By.xpath("//body//a"));
                System.out.println("List of links (Support): " + listOfLinksSupport.size());
                /**
                 for (WebElement each : listOfLinksSupport) {
                 System.out.println(each.getText());
                 System.out.println(each.getAttribute("href"));
                 }
                 */
                // 5.Print out total number of links in each page --- Done
                // 6.While in each page:
                // a.Print out how many link is missing textTOTAL
                // b.Print out how many link has textTOTAL

            }
        }
    }
//}
}

