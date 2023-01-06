package Lab9_Quiz;

public class Projector {
    String description;
    DvdPlayer dvdPlayer;

    public Projector(String description, DvdPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }

    void on(){
        System.out.println(this.description + " on");
    }
    void off(){
        System.out.println(this.description + " off");
    }

    void wideScreenMode(){
        System.out.println(this.description + " in widescreen mode." + dvdPlayer.setWideScreen());
    }
}
