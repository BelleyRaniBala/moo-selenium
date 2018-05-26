package com.example.moo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends AbstractPage {
    public static final By HEADERS = By.xpath("//*[@id=\"hits\"]/div/div[*]/div/div[1]");

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getResultHeaders() {
        List<String> results = new ArrayList<String>();

        List<WebElement> elements = driver.findElements(HEADERS);
        for (WebElement element : elements) {
            results.add(element.getText());
        }
        return results;
    }
}
