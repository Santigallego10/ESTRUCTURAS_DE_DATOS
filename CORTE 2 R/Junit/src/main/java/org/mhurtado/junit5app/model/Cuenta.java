package org.mhurtado.junit5app.model;

import java.math.BigDecimal;
import java.util.Locale;

public class Cuenta {

    private String person;
    private BigDecimal balance;


    public Cuenta(String person, BigDecimal balance) {
        this.balance = balance;
        this.person = person;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
