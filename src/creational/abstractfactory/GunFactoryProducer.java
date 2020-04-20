package creational.abstractfactory;

import creational.abstractfactory.lucznik.LucznikFactory;
import creational.abstractfactory.walther.WaltherFactory;

class GunFactoryProducer {

    static GunFactory getFactory(String name) {
        switch (name) {
            case "walther":
                return new WaltherFactory();
            case "lucznik":
                return new LucznikFactory();
            default:
                throw new IllegalArgumentException("unknown " + name);
        }
    }
}
