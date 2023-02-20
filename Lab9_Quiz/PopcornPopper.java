package Lab9_Quiz;

public class PopcornPopper {
    String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    void popcornPopperOn(){
        System.out.println(this.description + " on");
    }
    void popcornPopperOff(){
        System.out.println(this.description + " of");
    }
    void pop(){
        System.out.println(this.description + " popping popcorn.");
    }
}
