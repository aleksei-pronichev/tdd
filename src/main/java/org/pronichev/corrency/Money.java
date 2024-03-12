package org.pronichev.corrency;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        var money = (Money) o;
        return amount == money.amount;
    }
}
