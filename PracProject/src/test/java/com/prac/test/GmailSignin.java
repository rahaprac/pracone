package com.prac.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pac.selenium.utils.BrowserStartUtils;
import com.pac.selenium.utils.Const;

public class GmailSignin {
    public static void main(String[] args) throws IOException {
        WebDriver driver = null;
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(new File(Const.propertiesPath));
        prop.load(fis);
        BrowserStartUtils start = new BrowserStartUtils();
        driver = start.openBrowser(prop.getProperty("browser"));
        driver.get(prop.getProperty("url"));
        driver.findElement(By.tagName(Const.userName)).sendKeys(prop.getProperty("userName"));;
        driver.findElement(By.xpath(Const.userNameNext)).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name(Const.password)).sendKeys(prop.getProperty("password"));
        driver.findElement(By.id(Const.passwordNext)).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='COMPOSE']"))));
        System.out.println(driver.getTitle());
        if (driver.getTitle().contains("Inbox")) {
            System.out.println("Success");
        }


    }

}
