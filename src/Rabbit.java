public class Rabbit extends  Animals implements Printeble{
    private double rost;

    public double getRost() {
        return rost;
    }

    public Rabbit(String name, int age, double rost) {
        super(name, age);
        this.rost = rost;
    }

    @Override
    public void print() {
        System.out.println("name: " + getName() + " age: " + getAge() + " rost: " + getRost());
    }
}
