package com.prac.test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String chromeDriverPath = System.getProperty("user.dir") + File.separator + "Servers" + File.separator + "chromedriver";
        String url = "https://www.gmail.com";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement userName = driver.findElement(By.tagName("input"));
        userName.sendKeys("dummygmail");
        WebElement next = driver.findElement(By.xpath("//content/span[text()='Next']"));
        next.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys("dummygmail");
        driver.findElement(By.id("passwordNext")).click();
    }

}
