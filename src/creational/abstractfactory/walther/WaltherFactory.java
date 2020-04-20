package creational.abstractfactory.walther;

import creational.abstractfactory.GunFactory;
import creational.abstractfactory.Pistol;
import creational.abstractfactory.Rifle;

public class WaltherFactory implements GunFactory {
    @Override
    public Rifle getRifle() {
        return new WA2000() ;
    }

    @Override
    public Pistol getPistol() {
        return new PPK();
    }
}
