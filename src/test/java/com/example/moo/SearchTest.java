package com.example.moo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SearchTest {



    @DisplayName("Should return matching results when searching for valid product")
    @ParameterizedTest(name = "Searching for \"{0}\" should return item containing {1}")
    @CsvSource({ "Business Cards, Business Cards", "Stickers, Stickers", "Flyers, Flyers"})
    void shouldReturnMatchingResultsWhenSearchingForValidProduct(String search, String result) {

    }
}
