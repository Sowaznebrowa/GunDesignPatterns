package structural.decorator;

public class Stand implements GunAccessoriesDecorator {

    private Gun gun;

    Stand(Gun gun){
        this.gun = gun;
    }

    @Override
    public String description() {
        return gun.description() + " and Stand";
    }

    @Override
    public int price() {
        return gun.price() + 200;
    }
}
