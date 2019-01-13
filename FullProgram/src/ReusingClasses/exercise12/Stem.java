package ReusingClasses.exercise12;

public class Stem extends Root {
    private Component1 component1;
    private Component2 component2;
    private Component3 component3;
    public Stem() {
        super();
        System.out.println("Stem constructor");
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();
    }

    @Override
    public void dispose() {
        component3.dispose();
        component2.dispose();
        component1.dispose();
        super.dispose();
        System.out.println("Completion of Stem... ");

    }
}
