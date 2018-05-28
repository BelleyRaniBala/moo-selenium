package com.example.moo;

import com.example.moo.pages.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Product submenu tests")
public class ProductSubMenuTest {


    private HomePage homePage;

    @BeforeEach
    public void startWeb() {
        homePage = Launcher.chromeDriver();
    }

    @DisplayName("Should open list of products when clicked on products link")
    @Test
    void shouldOpenListOfProductsWhenClickedOnProducts() {
        MenuActions menu = homePage.menu();
        ProductsListPage productsListPage = menu.clickOnProductsLink();
        String header = productsListPage.getHeader();
        assertEquals("Products",header);
    }




    @DisplayName("Should return product details when selecting specific product")
    @ParameterizedTest(name = "Selecting \"{0}\"/\"{1}\" should return page containing \"{2}\"")
    @CsvSource({"Stickers, Round Stickers, Round Stickers","Flyers, Square Flyers, Square Flyers"})
    void shouldReturnProductDetailsWhenSelectingSpecificProduct(String category, String product, String expected) {
        MenuActions menu = homePage.menu();
        SingleProductPage singleProductPage = menu.selectProduct(category,product);
        boolean found = singleProductPage.getHeaderText().contains(expected);
        assertTrue(found);
    }





   @AfterEach
    void closeWeb() {
        homePage.quit();
    }

}
