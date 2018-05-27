package com.example.moo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage{

    public static final String HOMEPAGE_URL = "http://www.moo.com";
    public static final By SEARCH_BOX = By.id("query");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ResultsPage searchFor(String search) {
        WebElement searchBox = driver.findElement(SEARCH_BOX);
        searchBox.sendKeys(search);
        searchBox.sendKeys("\n");
        return new ResultsPage(driver);
    }
}
