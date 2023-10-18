public class Cat extends Animals implements Printeble{
    private String color;

    public String getColor() {
        return color;
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("name: " + getName() + " age: " + getAge() + " colors: " + getColor());
    }
}
