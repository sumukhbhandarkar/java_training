package main;

public class Bikes {
    public static void main(String []args) {
        Vehicle pulsar = new Vehicle();
        pulsar.setEngineSpecs("180CC");
        pulsar.setWheels(2);

        Vehicle avenger = new Vehicle();
        avenger.setEngineSpecs("220CC");
        avenger.setWheels(2);

        Vehicle maruti800 = new Vehicle();
        maruti800.setEngineSpecs("800CC");
        maruti800.setWheels(4);

//        Created 3 objects of vehicle class, each having it's own values for wheels and engineSpecs
//        I can create as many objects as I want. I can also create an array of objects.
//        A classic example to show Object Orientedness of Java. I have interface where I have the bluepring
//        The Vehicle class which uses the interface and gives description for all methods from the interfaces
//        Then I can have Bikes class which uses any / all methods from Vehicles class
        System.out.println("Avenger: " + avenger.getEngineSpecs() + ", " + avenger.getWheels());
        System.out.println("Pulsar: " + pulsar.getEngineSpecs() + ", " + pulsar.getWheels());
        System.out.println("Maruti 800: " + maruti800.getEngineSpecs() + ", " + maruti800.getWheels());
    }
}
