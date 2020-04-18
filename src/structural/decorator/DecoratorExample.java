package structural.decorator;

public class DecoratorExample {

    public static void print(){
        Gun rifleWithScopeAndStand = new Stand(new Scope(new Rifle()));
        System.out.println("Gun description: " + rifleWithScopeAndStand.description());
        System.out.println("Price: " + rifleWithScopeAndStand.price());
    }
}
