package com.pac.selenium.utils;

import java.io.File;

public class Const {
    public final static String userName = "input";
    public final static String userNameNext = "//content/span[text()='Next']";
    public final static String password = "password";
    public final static String passwordNext = "passwordNext";
    public final static String chromeDriverPath = System.getProperty("user.dir") + File.separator + "Servers" + File.separator + "chromedriver";
    public final static String propertiesPath = System.getProperty("user.dir") + File.separator + "DataFiles" + File.separator + "test.properties";
}
