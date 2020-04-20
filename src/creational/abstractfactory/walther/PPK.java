package creational.abstractfactory.walther;

import creational.abstractfactory.Pistol;

public class PPK implements Pistol {
    @Override
    public void printDescription() {
        System.out.println("Walther PPK Walnut");
    }
}
