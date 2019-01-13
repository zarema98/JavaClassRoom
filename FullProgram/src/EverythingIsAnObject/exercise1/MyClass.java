package EverythingIsAnObject.exercise1;

public class MyClass {
    public int number;
    public char symbol;

    public MyClass() {
        System.out.println("number: " + this.number);
        System.out.println("symbol: " + this.symbol);
    }

    public int getNumber() {
        return number;
    }

    public char getSymbol() {
        return symbol;
    }
}
