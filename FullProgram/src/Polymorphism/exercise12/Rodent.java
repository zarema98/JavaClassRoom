package Polymorphism.exercise12;


public class Rodent {
    private String name = "Rodent";
    private Characteristic c = new Characteristic("has tail");
    private Description d = new Description("About rodent");
    public Rodent () {
        System.out.println("Rodent constructor");
    }
    protected void eat () {
        System.out.println("Rodent.eat()");
    }

    protected void sleep () {
        System.out.println("Rodent.sleep()");
    }

    @Override
    public String toString() { return name; }
}

class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
}
class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }
}


class Mouse extends Rodent {
    private String name = "Mouse";
    private Characteristic c = new Characteristic("eats cheese");
    private Description d = new Description("About mouse");
    public Mouse () {
        System.out.println("Mouse constructor");
    }
    @Override
    protected void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    protected void sleep() {
        System.out.println("Mouse.sleep()");
    }

    @Override
    public String toString() { return name; }
}

class Hamster extends Rodent {
    private String name = "Hamster";
    private Characteristic c = new Characteristic("eats corn");
    private Description d = new Description("About Hamster");
    public Hamster () {
        System.out.println("Hamster constructor");
    }
    @Override
    protected void eat() {
        System.out.println("Hamster.eat()");
    }

    @Override
    protected void sleep() {
        System.out.println("Hamster.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}
