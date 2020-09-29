package de.bernhardscholz;

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




    /*public void addAnimalTwo(Animals animal) {
        while (next != null) {
            next.addAnimalTwo(animal);
        }
        AnimalListItem animalListItem = new AnimalListItem(animal);
        next = animalListItem;
    }

     */


    public void addAnimal(Animals animal) {
        if (next == null) {
            AnimalListItem animalListItem = new AnimalListItem(animal);
            next = animalListItem;
        } else {
            next.addAnimal(animal);
        }
    }

}
