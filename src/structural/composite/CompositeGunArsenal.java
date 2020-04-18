package structural.composite;

import java.util.ArrayList;
import java.util.List;

//COMPOSITE
public class CompositeGunArsenal implements Gun {

    private final List<Gun> gunList = new ArrayList<>();

    public void add(Gun gun){
        gunList.add(gun);
    }

    @Override
    public void print() {
        for (Gun gun:gunList) {
            gun.print(); //Delegation
        }
    }
}
