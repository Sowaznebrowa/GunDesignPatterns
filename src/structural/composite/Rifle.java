package structural.composite;

//LEAF
public class Rifle implements Gun {

    @Override
    public void print() {
        System.out.println("Rifle");
    }
}
