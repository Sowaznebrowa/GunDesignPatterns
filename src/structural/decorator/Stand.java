package structural.decorator;

public class Stand extends GunAccessoriesDecorator {

    private Gun gun;

    public Stand(Gun gun){
        this.gun = gun;
    }

    @Override
    String description() {
        return gun.description() + " and Stand";
    }

    @Override
    int price() {
        return gun.price() + 200;
    }
}
