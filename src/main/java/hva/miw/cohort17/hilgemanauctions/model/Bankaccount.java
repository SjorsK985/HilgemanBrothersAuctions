package hva.miw.cohort17.hilgemanauctions.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bankaccount {
    @Id
    private String accountNumber;

    public Bankaccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}