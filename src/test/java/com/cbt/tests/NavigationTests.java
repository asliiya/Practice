package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("firefox");

        driver.get("https://google.com");
        String firstUrl = driver.getTitle();

        driver.get("https://etsy.com");
        String secondUrl = driver.getTitle();

        driver.navigate().back();
        String thirdUrl = driver.getTitle();

        StringUtility.verifyEquals(firstUrl, thirdUrl);

        driver.navigate().forward();
        String fourthUrl = driver.getTitle();

        StringUtility.verifyEquals(secondUrl, fourthUrl);

        driver.quit();
    }
}
