package com.example.moo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static final String HOMEPAGE= "http://www.moo.com";
    public static final By SEARCH_BOX = By.id("query");

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultsPage searchFor(String search) {
        WebElement searchBox = driver.findElement(SEARCH_BOX);
        searchBox.sendKeys(search);
        searchBox.sendKeys("\n");
        return new ResultsPage(driver);
    }
}
