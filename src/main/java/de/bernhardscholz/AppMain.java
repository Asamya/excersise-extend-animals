package de.bernhardscholz;

public class AppMain {
    public static void main(String[] args) {
        Animals animal1 = new Cat("Hans");
        Animals animal2 = new Cat("Heidi");
        Animals animal3 = new Cat("Klaudia");
        Animals animal4 = new Dog("Wilhelm");
        Animals animal5 = new Dog("Friedhelm");
        Animals animal6 = new Dog("Wiuwiuwiu");

        AnimalListItem listItem = new AnimalListItem(animal1);
        // AnimalListItem additionalListItem = new AnimalListItem(animal1);

        // ListItem.addAnimalTwo(animal1);
        listItem.addAnimal(animal2);
        listItem.addAnimal(animal3);
        listItem.addAnimal(animal1);
        listItem.addAnimal(animal6);
        // ListItem.addAnimalTwo(animal4);

        System.out.println(listItem.toString());



    }
}
