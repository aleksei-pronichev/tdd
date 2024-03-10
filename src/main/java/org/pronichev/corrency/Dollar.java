package org.pronichev.corrency;

import java.util.Objects;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        var dollar = (Dollar) o;
        return amount == dollar.amount;
    }
}
