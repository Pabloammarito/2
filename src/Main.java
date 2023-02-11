public class Main {
    public static void main(String[] args) {
        // Create two Bicycle objects
        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle();

        // Use the objects to call the methods from the Vehicle interface
        bicycle1.changeGear(2);
        bicycle1.speedUp(3);
        bicycle1.applyBrakes(1);
        System.out.println("Bicycle 1 states: ");
        bicycle1.printStates();

        bicycle2.changeGear(1);
        bicycle2.speedUp(4);
        System.out.println("Bicycle 2 states: ");
        bicycle2.printStates();
    }
}