package petxample;

public class Pet {
    public String name;
    private int hungerLevel;

    public Pet(String name, int hungerLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
}
