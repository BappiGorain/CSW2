import java.util.*;

class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    // Override hashCode method to print unique ID
    @Override
    public int hashCode() {
        return Objects.hash(name, color, type);
    }
}

public class Q6 {
    public static void main(String[] args) {
        // Creating objects of Animal class
        Animal dog = new Animal("Dog", "Brown", "Pet");
        Animal cat = new Animal("Cat", "White", "Pet");
        Animal lion = new Animal("Lion", "Yellow", "Wild");

        // Printing hash codes for the objects
        System.out.println("Dog Hash Code: " + dog.hashCode());
        System.out.println("Cat Hash Code: " + cat.hashCode());
        System.out.println("Lion Hash Code: " + lion.hashCode());
    }
}
