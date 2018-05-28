package com.example.moo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsListPage extends AbstractPage{
    private static final By HEADER = By.xpath("//*[@id=\"htmlBody\"]/div[2]/div/div/div/h1");

    public ProductsListPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return driver.findElement(HEADER).getText();
    }
}
