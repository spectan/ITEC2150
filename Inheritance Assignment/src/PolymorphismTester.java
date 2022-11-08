public class PolymorphismTester {
    public static void main(String[] args) {
        //Modify the animal class, and create a dog and cat class that inherit from the animal class.
        //Inherit and modify an animalSound method using polymorphism to change the behavior of that method ijn the dog and cat classes.
        
        //Create an animal, a dog, and a cat object and print out the results of the animalsound method for each object.
        Animal myAnimal = new Animal(4, 10);
        myAnimal.animalSound();
        Dog myDog = new Dog(4, 11, "Blonde");
        myDog.animalSound();
        Cat myCat = new Cat(2, 12, "short");
        myCat.animalSound();
    }
}
