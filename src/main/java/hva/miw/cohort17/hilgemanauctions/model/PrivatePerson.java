package hva.miw.cohort17.hilgemanauctions.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
public class PrivateUser extends User {
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String firstName;
    private String prepositions;
    private String lastName;
    private LocalDate dateOfBirth;

    public PrivateUser(String email, String password, Address address, Bankaccount bankaccount, Gender gender, String firstName, String prepositions, String lastName, LocalDate dateOfBirth) {
        super(email, password, address, bankaccount);
        this.gender = gender;
        this.firstName = firstName;
        this.prepositions = prepositions;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPrepositions() {
        return prepositions;
    }

    public void setPrepositions(String prepositions) {
        this.prepositions = prepositions;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
