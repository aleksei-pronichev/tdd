package org.pronichev.corrency;

public class Dollar {

    private final int amount;

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
