import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Max", true, "Corgi", 5));
        animals.add(new Animal("Charlie", false, "Daschund", 8));
        animals.add(new Animal("Luna", true, "Golden Retriever", 2));

        System.out.println("Animal Menu, enter nothing to stop loop");
        while (true){
            System.out.println("Please enter a name: ");
            String name = scanner.nextLine();
            String isDog;
            if(name.equals("")){
                break;
            }
            System.out.println("Is this animal a dog? Yes or no: ");
            isDog = scanner.nextLine();

            if(isDog.equalsIgnoreCase("yes")){
                System.out.println("What breed is this dog? ");
                String breed = scanner.nextLine();
                System.out.println("What age is this dog?  ");
                int age = Integer.parseInt(scanner.nextLine());
                animals.add(new Animal(name, true, breed, age));
            } else if(isDog.equalsIgnoreCase("no")){
                animals.add(new Animal(name, false));
            }

        }
        for(Animal animal:animals){
            System.out.println(animal);
        }
    }
}
