public class Main {
    // This code is a demo to pass objects from one object to another
    // In the real code, I'll need to override the packet object with another
    // This demo presents an opportunity to test that out
    static void SwapCar(Garage G1, Garage G2){
        // Okay, so in order for the to work, a 'park' function will need to be made for the packets
        Garage Storage = new Garage();
        Storage.park(G1.car);
        G1.park(G2.car);
        G2.park(Storage.car);
    }// SwapCar

    public static void main(String[] args){

        // Creating the first Garage object
        Garage RyanGarage = new Garage(); // it seems making the classes public avoids the extends necessity

        // Creating car object
        Car car = new Car("BMW");

        RyanGarage.park(car);
        System.out.println("The " + RyanGarage.car.name + " is parked in Ryan's garage.");

        // Now the field test begins!
        
        // Making a second Garage object
        Garage ToddGarage = new Garage();

        // Creating second car
        Car car2 = new Car("Tesla");

        // Storing the car in Todd's garage
        ToddGarage.park(car2);
        System.out.println("The " + ToddGarage.car.name + " is parked in Todd's garage.");
        
        // Calling the SwapCar Function
        SwapCar(RyanGarage, ToddGarage);
       
        System.out.println("Check");
        System.out.println("The " + RyanGarage.car.name + " is parked in Ryan's garage.");
        System.out.println("The " + ToddGarage.car.name + " is parked in Todd's garage.");

    }// main

}// Main Class