package com.example.moo;

import com.example.moo.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launcher {

    static HomePage chromeDriver(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        return launch(driver);
    }

    private static HomePage launch( WebDriver driver) {
        driver.get(HomePage.HOMEPAGE_URL);
        return new HomePage(driver);
    }
}
