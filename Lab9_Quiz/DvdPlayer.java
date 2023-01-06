package Lab9_Quiz;

public class DvdPlayer {
    String description;
    Amplifier amplifier;
    
    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }
    
    String setWideScreen(){
        return " (16x9 aspect ratio.)";
    }
    void onAmplifier(){
        System.out.println(amplifier.description + " setting DVD player to " + this.description);
    }
    void on(){
        System.out.println(this.description + " on.");
    }
    void playMovie(String movie){
        System.out.println(this.description + " on " + movie);
    }
    void stopMovie(String movie){
        System.out.println(this.description + " stop " + movie);
    }
    void eject(){
        System.out.println(this.description + " eject");
    }
    void offDvd(){
        System.out.println(this.description + " off");
    }


}
