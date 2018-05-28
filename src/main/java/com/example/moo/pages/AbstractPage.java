package com.example.moo.pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected final WebDriver driver;


    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

/*    public MenuPage menu(){
        return new MenuPage(driver);
    }*/

    public void quit(){
        driver.quit();
    }

    public MenuActions menu() {
        return new MenuActions(driver);
    }


}
