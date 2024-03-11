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
        var five = new Franc(5);

        assertEquals(new Franc(expected), five.times(multiplier));
    }

    @Test
    void testEquality() {
        var obj1 = new Franc(5);
        var obj2 = new Franc(5);
        assertEquals(obj1, obj2);
    }

    @Test
    void testNotEquality() {
        var obj1 = new Franc(5);
        var obj2 = new Franc(6);
        assertNotEquals(obj1, obj2);
    }
}
