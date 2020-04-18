package structural.composite;

public class CompositeExample {

    public static void print(){
        Gun rifle1 = new Rifle();
        Gun rifle2 = new Rifle();
        Gun pistol1 = new Pistol();
        Gun pistol2 = new Pistol();

        CompositeGunArsenal arsenal2 = new CompositeGunArsenal();
        arsenal2.add(rifle1);
        arsenal2.add(rifle2);
        arsenal2.add(pistol1);

        CompositeGunArsenal arsenal3 = new CompositeGunArsenal();
        arsenal3.add(pistol2);

        CompositeGunArsenal arsenal1 = new CompositeGunArsenal();
        arsenal1.add(arsenal2);
        arsenal1.add(arsenal3);

        arsenal1.print();
    }


}
