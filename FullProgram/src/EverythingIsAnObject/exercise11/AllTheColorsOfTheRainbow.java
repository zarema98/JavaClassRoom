package EverythingIsAnObject.exercise11;

public class AllTheColorsOfTheRainbow {
   private int anIntegerRepresentingColors;

    public AllTheColorsOfTheRainbow(int anIntegerRepresentingColors) {
        this.anIntegerRepresentingColors = anIntegerRepresentingColors;
    }

    public void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
    }

    @Override
    public String toString() {
        return "AllTheColorsOfTheRainbow." +
                "anIntegerRepresentingColors = " + anIntegerRepresentingColors;
    }
}
