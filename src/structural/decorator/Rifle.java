package structural.decorator;

public class Rifle extends Gun {
    @Override
    String description() {
        return "Rifle";
    }

    @Override
    int price() {
        return 20000;
    }
}
