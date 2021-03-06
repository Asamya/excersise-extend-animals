package de.bernhardscholz;

public abstract class Animals {

    private String name;
    private String type;

    public Animals(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract int anzahlBeine();
}
