package com.example.moo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

// Hovering and clicking
public class MenuActions extends AbstractPage {
    public static final By PRODUCT_SUBMENU_LINK = By.xpath("//*[@id=\"htmlBody\"]/div[1]/div[3]/div[2]/header/div[2]/div[1]/nav/ul/li[1]/a");


    public MenuActions(WebDriver driver) {
        super(driver);
    }

    public ProductsListPage clickOnProductsLink() {

        driver.findElement(PRODUCT_SUBMENU_LINK).click();

        return new ProductsListPage(driver);
    }

    public SingleProductPage selectProduct(String category, String product) {

        WebElement productSubmenu = driver.findElement(PRODUCT_SUBMENU_LINK);
        Actions action = new Actions(driver);
        action.moveToElement(productSubmenu)
                .pause(200)
                .moveToElement(driver.findElement(By.xpath("//*[contains(text(),'"+category+"')]")))
                .pause(200)
                .moveToElement(driver.findElement(By.xpath("//*[contains(text(),'"+product+"')]")))
                .pause(200)
                .click()
                .build().perform();

        return new SingleProductPage(driver);
    }

}
