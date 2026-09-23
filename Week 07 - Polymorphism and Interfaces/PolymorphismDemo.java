public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();
    }
}
