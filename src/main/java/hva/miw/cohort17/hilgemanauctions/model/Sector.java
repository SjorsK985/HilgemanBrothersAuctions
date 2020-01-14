package hva.miw.cohort17.hilgemanauctions.model;

public enum Sector {
    LANDBOUW("Landbouw, Bosbouw & Visserij"),
    INDUSTRIE("Lichte & Zware Industrie"),
    BOUW("Bouw & Grondverzet"),
    NUTS("Energie- & Watervoorziening"),
    LOGISTIEK("Transport & Logistiek"),
    GROOTHANDEL("Groothandel & Import/Export"),
    DETAILHANDEL("Detailhandel"),
    VASTGOED("Vastverhuur en beheer"),
    OVERHEDEN("Overheden"),
    ZORG("Gezondheidszorg"),
    ONDERWIJS("Onderwijs"),
    HORECA("Horeca"),
    CREATIEVESECTOR("Creatieve sector wo Kunsten, Muziek & Vormgeving");

    public final String name;

    private Sector(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
