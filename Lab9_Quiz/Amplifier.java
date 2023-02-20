package Lab9_Quiz;

public class Amplifier {
    String description;

    public Amplifier(String description) {
        this.description = description;
    }

    void surroundSound(){
        System.out.println(this.description + " surround sound on (5 speakers, 1 subwoofer.)");
    }
    void settingVolume(){
        System.out.println(this.description + " setting volume to 5.");
    }
    void ofAmplifier(){
        System.out.println(this.description + " off");
    }
}
