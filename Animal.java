public class Animal {
    private String animalName;
    private boolean isDog;
    private String breed;
    private int age;

    public Animal(String animalName, boolean isDog, String breed, int age) {
        this.animalName = animalName;
        this.isDog = isDog;
        this.breed = breed;
        this.age = age;
    }

    public Animal(String name, boolean isDog) {
        this.animalName = name;
        this.isDog = isDog;
    }

    public String getAnimalName() {
        return animalName;
    }

    public boolean isDogStatus() {
        return isDog;
    }

    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }

    public String toString() {

        return getAnimalName() + " is a dog = " + isDogStatus();
    }
}
