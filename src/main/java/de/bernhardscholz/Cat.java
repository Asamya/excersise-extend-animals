package de.bernhardscholz;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    public int anzahlBeine() {
        return 4;
    }
}
