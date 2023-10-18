
public class Main {
    public static void main(String[] args) {
        Animals[] animals={createObject("Dog"),createObject("Cat"), createObject("Rabbit")};
        for (Animals animals1:animals) {
            animals1.print();
        }
    }

    public static Animals createObject(String className) {
        Animals animals = null;

        if (className.equals("Dog")) {
            animals = new Dog("Bobik ", 3, " Alabai");
        } else if (className.equals("Cat")) {
            animals = new Cat("Sharik", 2, "White");

        } else if (className.equals("Rabbit")) {
            animals = new Rabbit("null",1,15.3);
        }
        return animals;
    }
}