package structural.decorator;

public class Rifle implements Gun {
    @Override
    public String description() {
        return "Rifle";
    }

    @Override
    public int price() {
        return 20000;
    }
}
