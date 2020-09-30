package de.bernhardscholz;

import java.util.Collection;

public class AnimalListItem {


    private Animals animal;
    private AnimalListItem next;

    public AnimalListItem(Animals animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        if (next == null) {
            return animal.getName();
        } else {
            return animal.getName() + "\n" + next.toString();
        }
    }

    /*public void removeAnimal(Animals animal) {
        if ()
    }

     */


    public void addAnimal(Animals animal) {
        Collection<String> animalNameList = new AnimalListItem()
        if (next == null) {
            animalNameList.add(animal.getName());
        } else {
            next.addAnimal(animal);
        }
    }

    /*public void addAnimalTwo(Animals animal) {
        while (next != null) {
            next.addAnimalTwo(animal);
        }
        AnimalListItem animalListItem = new AnimalListItem(animal);
        next = animalListItem;
    }

     */
}
