package org.pronichev.corrency;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FrancTest {

    @ParameterizedTest
    @CsvSource({
        "2, 10",
        "3, 15",
        "4, 20"
    })
    void testMultiplication(int multiplier, int expected) {
        var five = Money.franc(5);

        assertEquals(Money.franc(expected), five.times(multiplier));
    }

    @Test
    void testEquality() {
        var obj1 = Money.franc(5);
        var obj2 = Money.franc(5);
        assertEquals(obj1, obj2);
    }

    @Test
    void testNotEquality() {
        var obj1 = Money.franc(5);
        var obj2 = Money.franc(6);
        assertNotEquals(obj1, obj2);
    }

    @Test
    void testDifferentEquality() {
        var obj1 = new Money(5, "CHF");
        var obj2 = new Franc(5, "CHF");
        assertEquals(obj1, obj2);
    }
}
