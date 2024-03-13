package org.pronichev.corrency;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DollarTest {

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
    void testEquality() {
        var obj1 = Money.dollar(5);
        var obj2 = Money.dollar(5);
        assertEquals(obj1, obj2);
    }

    @Test
    void testNotEquality() {
        var obj1 = Money.dollar(5);
        var obj2 = Money.dollar(6);
        assertNotEquals(obj1, obj2);
    }
}
