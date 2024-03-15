package org.pronichev.corrency;

import java.util.Objects;

public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public boolean equals(Object o) {
        var that = (Money) o;
        return amount == that.amount
            && Objects.equals(this.currency, that.currency);
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    public String currency() {
        return currency;
    }
}
