package creational.abstractfactory.lucznik;

import creational.abstractfactory.Rifle;

public class Beryl implements Rifle {
    @Override
    public void printDescription() {
        System.out.println("Lucznik Beryl");
    }
}
