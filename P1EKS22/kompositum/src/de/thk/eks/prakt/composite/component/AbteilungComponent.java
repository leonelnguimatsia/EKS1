package de.thk.eks.prakt.composite.component;

public abstract class AbteilungComponent {

    /**
     * Definition: Abstrakte Klasse "AbteilungComponent"
     * Mit Eigenschaften
     */
    protected String name;

    public AbteilungComponent() {

    }

    public AbteilungComponent(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print(String einruecken);

    public abstract int getMitarbeiterAnzahl();
}
