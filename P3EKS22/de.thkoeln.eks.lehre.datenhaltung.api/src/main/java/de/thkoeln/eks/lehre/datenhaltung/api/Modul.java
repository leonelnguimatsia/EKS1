package de.thkoeln.eks.lehre.datenhaltung.api;

public class Modul {
    private String titel;
    private String dozent;
    private Integer id;


    public Modul(String titel, String dozent) {
        this.titel = titel;
        this.dozent = dozent;
    }

    public String getTitel() {
        return titel;
    }

    public Integer getId() {
        return id;
    }

    public String getDozent() {
        return dozent;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }
}
