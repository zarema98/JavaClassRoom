package EverythingIsAnObject.exercise4;

public class DataOnly {
    public int i;
    public double d;
    public boolean b;

    public DataOnly (int i, double d, boolean b) {
        this.i = i;
        this.d = d;
        this.b = b;
    }

    public void show () {
        System.out.println("i = " + i + "\n" +
                            "d = " + d + "\n" +
                            "b = " + b);
    }
}
