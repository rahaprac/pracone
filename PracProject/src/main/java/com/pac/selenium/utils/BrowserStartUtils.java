package com.pac.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStartUtils {
    public WebDriver openBrowser(String browserName) {
        WebDriver driver = null;
        if (browserName.contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", Const.chromeDriverPath);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }
        return driver;

    }

}
