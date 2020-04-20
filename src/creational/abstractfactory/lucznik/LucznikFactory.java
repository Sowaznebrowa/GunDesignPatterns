package creational.abstractfactory.lucznik;

import creational.abstractfactory.GunFactory;
import creational.abstractfactory.Pistol;
import creational.abstractfactory.Rifle;

public class LucznikFactory implements GunFactory {

    @Override
    public Rifle getRifle() {
        return new Beryl();
    }

    @Override
    public Pistol getPistol() {
        return new MAG();
    }
}
