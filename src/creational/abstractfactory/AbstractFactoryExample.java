package creational.abstractfactory;

import java.util.List;
import java.util.Random;

public class AbstractFactoryExample {

    public static void print(){
        String randomName = List.of("walther", "lucznik").get(new Random().nextInt(2));

        // get the gun factory for a name
        GunFactory factory = GunFactoryProducer.getFactory(randomName);

        // use the random factory to create the rifle
        Rifle rifle = factory.getRifle();
        rifle.printDescription();

        // use the random factory to create the pistol
        Pistol pistol = factory.getPistol();
        pistol.printDescription();
    }



}
