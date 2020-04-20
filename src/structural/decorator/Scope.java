package structural.decorator;

public class Scope implements GunAccessoriesDecorator {

    private Gun gun;

    Scope(Gun gun){
        this.gun = gun;
    }

    @Override
    public String description() {
        return gun.description() + " and Scope";
    }

    @Override
    public int price() {
        return gun.price() + 300;
    }
}
