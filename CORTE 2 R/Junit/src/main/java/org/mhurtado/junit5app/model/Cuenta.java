package org.mhurtado.junit5app.model;

import org.mhurtado.junit5app.exception.DineroInsuficienteException;

import java.math.BigDecimal;
import java.util.Locale;

public class Cuenta {

    private Banco banco;
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

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void debito (BigDecimal monto){
       BigDecimal newBalance= this.balance.subtract(monto);
       if(newBalance.compareTo(BigDecimal.ZERO)< 0){
           throw new DineroInsuficienteException("Dinero insuficiente");

       }
       this.balance = newBalance;

    }

    public void credit(BigDecimal monto){
        this.balance= this.balance.add(monto);

    }


    @Override
    public boolean equals(Object obj) {
        if( !(obj instanceof Cuenta)){
            return false;
        }
        Cuenta c = (Cuenta)obj;
        if(this.person==null || this.balance == null){
            return false;
        }
        return this.person.equals(c.getPerson()) && this.balance.equals(c.getBalance());
    }
}
