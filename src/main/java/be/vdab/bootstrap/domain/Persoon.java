package be.vdab.bootstrap.domain;

public class Persoon {
    private final long id;
    private final String voornaam;
    private final String familienaam;
    private final String woonplaats;

    public Persoon(long id, String voornaam, String familienaam, String woonplaats) {
        this.id = id;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.woonplaats = woonplaats;
    }

    public long getId() {
        return id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }
}
