package creational.abstractfactory.lucznik;

import creational.abstractfactory.Pistol;

public class MAG implements Pistol {
    @Override
    public void printDescription() {
        System.out.println("Lucznik MAG-98");
    }
}
