public class Main {
    public static void main(String[] args) {

        Animal animal= new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Bittu",8,20,2,4,1,20,"Long silky");
        dog.eat();
        Fish fish= new Fish("Abha",1,5,10,2,5);
        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.

        // Finally, create another class, a specific type of Car that inherits from the Car class.

        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.
    }
}