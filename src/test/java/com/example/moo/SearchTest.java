package com.example.moo;

import com.example.moo.pages.HomePage;
import com.example.moo.pages.ResultsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest {


    private HomePage homePage;

    @BeforeEach
    public void startWeb() {
        homePage = Launcher.chromeDriver();
    }


    @DisplayName("Should return matching results when searching for valid product")
    @ParameterizedTest(name = "Searching for \"{0}\" should return item containing \"{1}\"")
    @CsvSource({"Business Cards, Business Cards", "Stickers, Stickers", "Flyers, Flyers"})
    void shouldReturnMatchingResultsWhenSearchingForValidProduct(String search, String expected) {
        ResultsPage resultsPage = homePage.searchFor(search);
        List<String> resultHeaders = resultsPage.getResultHeaders();
        int count = 0;
        for (String resultHeader : resultHeaders) {
            if (resultHeader.toLowerCase().contains(expected.toLowerCase())) {
                count++;
            }
        }
        assertTrue(count > 0);
    }


    @DisplayName("Should receive a message when customer searches for an invalid product")
    @Test
    void shouldReceiveAMessageWhenCustomerSearchesForAnInvalidProduct() {

        ResultsPage resultsPage = homePage.searchFor("sdjfnjsdfj");
        boolean found = resultsPage.getNoPageFoundText().contains("No pages found");
        assertTrue(found);


    }

    @AfterEach
    void closeWeb() {
        homePage.quit();
    }
}
