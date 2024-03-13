package org.pronichev.corrency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

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
}