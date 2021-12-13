package petxample;

import petxample.Pet;

public class Owner {
    private Pet pet;
public String name;
    public Owner(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }
    public String feedPet() {
        this.pet.setHungerLevel(this.pet.getHungerLevel() - 1);
        return this.pet.getName() + "'s hunger level reduced! New level " + this.pet.getHungerLevel();
    }
    public String walkPet() {
        this.pet.setHungerLevel(this.pet.getHungerLevel() +1);
        return this.pet.getName() + "'Walked 100 meters! Hunger level: " + this.pet.getHungerLevel();
    }
    public String sayHello(){
        return "Hello! My name is " + this.name + " and the is my pet " + this.pet.getName();
    }
}
