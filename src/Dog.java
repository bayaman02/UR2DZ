public class Dog extends Animals implements Printeble{
    private String poroda;

    public String getPoroda() {
        return poroda;
    }

    public Dog(String name, int age, String poroda) {
        super(name, age);
        this.poroda = poroda;
    }

    @Override
    public void print() {
        System.out.println("name: " + getName() + " age: " + getAge() + " poroda: " + getPoroda());
    }
}
