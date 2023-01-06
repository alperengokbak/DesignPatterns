package Lab9_Quiz;

public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    void down(){
        System.out.println(this.description + " going down.");
    }
    void up(){
        System.out.println( this.description + " going up");
    }
}
