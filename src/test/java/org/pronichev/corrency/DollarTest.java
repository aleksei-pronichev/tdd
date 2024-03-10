package org.pronichev.corrency;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTest {

    @ParameterizedTest
    @CsvSource({
        "2, 10",
        "3, 15",
        "4, 20"
    })
    void testMultiplication(int multiplier, int expected) {
        var five = new Dollar(5);
        var product = five.times(multiplier);
        five.times(multiplier);
        assertEquals(expected, product.amount);
    }
}
