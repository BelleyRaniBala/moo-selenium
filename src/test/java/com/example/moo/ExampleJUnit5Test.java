package com.example.moo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

class ExampleJUnit5Test {
    @Test
    void justATestOfTests(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
