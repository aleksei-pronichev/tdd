package org.pronichev.corrency;

import java.util.Objects;

public abstract class Money {

    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        var money = (Money) o;
        return amount == money.amount
            && Objects.equals(this.getClass(), money.getClass());
    }
}
