package creational.abstractfactory.walther;

import creational.abstractfactory.Rifle;

public class WA2000 implements Rifle {

    @Override
    public void printDescription() {
        System.out.println("Walther WA2000 sniper rifle");
    }
}
