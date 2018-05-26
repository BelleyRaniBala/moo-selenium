package com.example.moo.pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected final WebDriver driver;


    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public void quit(){
        driver.quit();
    }
}
