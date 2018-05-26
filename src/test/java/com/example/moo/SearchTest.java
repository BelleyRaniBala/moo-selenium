package com.example.moo;

import com.example.moo.pages.HomePage;
import com.example.moo.pages.ResultsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SearchTest {


    private HomePage homePage;

    @BeforeEach
    public void startWeb() {
        homePage = Launcher.chromeDriver();

    }


    @DisplayName("Should return matching results when searching for valid product")
    @ParameterizedTest(name = "Searching for \"{0}\" should return item containing \"{1}\"")
//    @CsvSource({"Business Cards, Business Cards", "Stickers, Stickers", "Flyers, Flyers"})
    @CsvSource({"Business Cards, Business Cards"})
    void shouldReturnMatchingResultsWhenSearchingForValidProduct(String search, String result) {
        ResultsPage resultsPage = homePage.searchFor(search);
    }
}
