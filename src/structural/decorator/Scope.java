package structural.decorator;

public class Scope extends GunAccessoriesDecorator {

    private Gun gun;

    public Scope(Gun gun){
        this.gun = gun;
    }

    @Override
    String description() {
        return gun.description() + " and Scope";
    }

    @Override
    int price() {
        return gun.price() + 300;
    }
}
