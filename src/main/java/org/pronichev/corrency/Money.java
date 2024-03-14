package org.pronichev.corrency;

import java.util.Objects;

public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        var money = (Money) o;
        return amount == money.amount
            && Objects.equals(this.getClass(), money.getClass());
    }

    public String currency() {
        return currency;
    }
}
