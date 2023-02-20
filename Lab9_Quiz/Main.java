package Lab9_Quiz;

public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Top-0-Line Amplifier");
        Tuner tuner = new Tuner("Top-0-Line AM/FM Tuner");
        DvdPlayer dvd = new DvdPlayer("Top-0-Line DVD Player",amplifier);
        Projector projector = new Projector("Top-0-Line DVD Projector", dvd);
        TheaterLight theaterLight = new TheaterLight("Theater Ceiling lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, dvd, projector, theaterLight, screen, popcornPopper);
        homeTheater.watchingMovie();
        homeTheater.endMovie();
    }
}
