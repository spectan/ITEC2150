public class Dog extends Animal{
    private String color;

    public Dog(int numLegs, int age, String color) {
        super(age, numLegs);
        this.color = color;

    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void animalSound() {
        System.out.println("The dog goes bow wow");
    }
}
