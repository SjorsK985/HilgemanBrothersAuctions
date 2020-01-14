package hva.miw.cohort17.hilgemanauctions.model;

public enum Gender {
    MALE("Dhr."),
    FEMALE("Mw."),
    NEUTRAL("Neutraal");

    public final String name;

    private Gender(String name){
        this.name = name;
    }

    public String getStringValue() {
        return name;
    }
}
