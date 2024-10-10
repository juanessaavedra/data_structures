import java.util.ArrayList;
import java.util.List;

public class PECSExample {
    // Producer extends
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    // Consumer super
    public static void addCat(List<? super Cat> animals) {
        animals.add(new Cat("Whiskers"));
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Fluffy"));
        cats.add(new Cat("Mittens"));

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Buddy"));

        // Producer extends
        printAnimals(cats);  // Funciona porque Cat extiende Animal
        printAnimals(animals);

        // Consumer super
        addCat(cats);  // Funciona porque la lista es de Cat
        addCat(animals);  // Funciona porque Animal es super de Cat

        System.out.println("Después de agregar un gato:");
        printAnimals(animals);
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}