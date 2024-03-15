package org.pronichev.corrency;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @ParameterizedTest
    @CsvSource({
        "2, 10",
        "3, 15",
        "4, 20"
    })
    void testMultiplication(int multiplier, int expected) {
        var five = Money.dollar(5);

        assertEquals(Money.dollar(expected), five.times(multiplier));
    }

    @Test
    void testNotEqualityOfDifferentCurrency() {
        Money dollar = Money.dollar(10);
        Money franc = Money.franc(10);
        assertNotEquals(dollar, franc);
    }

    @Test
    void testEqualityOfSameCurrency() {
        Money dollar1 = Money.dollar(10);
        Money dollar2 = Money.dollar(10);
        assertEquals(dollar1, dollar2);
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}