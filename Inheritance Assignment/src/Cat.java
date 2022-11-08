public class Cat extends Animal{
    private String hairLength;

    public Cat(int numLegs, int age, String hairLength) {
        super(age, numLegs);
        this.hairLength = hairLength;

    }

    public String gethairLength() {
        return hairLength;
    }
    public void sethairLength(String hairLength) {
        this.hairLength = hairLength;
    }
    public void animalSound() {
        System.out.println("The cat goes moo");
    }
}
