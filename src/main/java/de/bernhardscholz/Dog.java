package de.bernhardscholz;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    @Override
    public int anzahlBeine() {
        return 4;
    }
}
