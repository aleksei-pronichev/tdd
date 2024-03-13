package org.pronichev.corrency;

import java.util.Objects;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        var money = (Money) o;
        return amount == money.amount
            && Objects.equals(this.getClass(), money.getClass());
    }
}
