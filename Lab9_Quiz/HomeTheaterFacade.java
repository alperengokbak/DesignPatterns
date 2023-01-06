package Lab9_Quiz;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    Projector projector;
    TheaterLight theaterLight;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, Projector projector,
            TheaterLight theaterLight, Screen screen, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.theaterLight = theaterLight;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    void watchingMovie(){
        System.out.println("Get ready to watch a movie...");
        popcornPopper.popcornPopperOn();
        popcornPopper.pop();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        dvdPlayer.onAmplifier();
        amplifier.surroundSound();
        amplifier.settingVolume();
        dvdPlayer.on();
        dvdPlayer.playMovie("Riders of LostArk");
    }
    void endMovie(){
        System.out.println("\n\n Shutting movie theater down.");
        popcornPopper.popcornPopperOff();
        theaterLight.onLight();
        screen.up();
        projector.off();
        amplifier.ofAmplifier();
        dvdPlayer.stopMovie("Riders of LostArk");
        dvdPlayer.eject();
        dvdPlayer.offDvd();
    }
}
