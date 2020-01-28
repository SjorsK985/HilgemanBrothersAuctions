package hva.miw.cohort17.hilgemanauctions.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class CompanyUser extends User {

    private String companyName;
    @Enumerated(EnumType.STRING)
    private Sector sector;

    public CompanyUser(String email, String password, Address address, Bankaccount bankaccount, String companyName, Sector sector) {
        super(email, password, address, bankaccount);
        this.companyName = companyName;
        this.sector = sector;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
}
