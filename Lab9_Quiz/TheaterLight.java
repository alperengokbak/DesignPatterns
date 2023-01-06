package Lab9_Quiz;

public class TheaterLight {
    String description;

    public TheaterLight(String description) {
        this.description = description;
    }

    String dim(){
        return this.description + " dimming to %10";
    }
    String onLight(){
        return this.description + " on";
    }
}
