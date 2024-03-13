package org.pronichev.corrency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void testNotEqualityOfDifferentCurrency() {
        Money dollar = new Dollar(10);
        Money franc = new Franc(10);
        assertNotEquals(dollar, franc);
    }

    @Test
    void testEqualityOfSameCurrency() {
        Money dollar1 = new Dollar(10);
        Money dollar2 = new Dollar(10);
        assertEquals(dollar1, dollar2);
    }
}