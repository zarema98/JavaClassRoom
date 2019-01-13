package Polymorphism.exercise8;

public class Music {
    public static void tune (Instrument i) {
        i.play(Note.MIIDLE_C);
    }
    public static void tuneAll (Instrument [] instruments) {
        for(Instrument i :instruments)
            tune(i);
    }
}
class Instrument {
    public void play (Note note) {
        System.out.println("Instrument.play() " + note);
    }

    public String what() {
        return "Instrument";
    }

    public void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    @Override
    public void play (Note note) {
        System.out.println("Wind.play() " + note);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    @Override
    public void play (Note note) {
        System.out.println("Percussion.play() " + note);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    @Override
    public void play (Note note) {
        System.out.println("Stringed.play() " + note);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    @Override
    public void play (Note note) {
        System.out.println("Brass.play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    @Override
    public void play (Note note) {
        System.out.println("Woodwind.play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}