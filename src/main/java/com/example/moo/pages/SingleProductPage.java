package com.example.moo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Handling the product details. get the text
public class SingleProductPage extends AbstractPage {


    private static final By HEADER =By.xpath("//*[@id=\"htmlBody\"]/section[1]/div[3]/div/div/div[2]/div/div[1]/h1") ;
    public SingleProductPage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText() {
        return driver.findElement(HEADER).getText();
    }
}
