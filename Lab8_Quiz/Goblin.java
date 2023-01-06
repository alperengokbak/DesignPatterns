package Lab8_Quiz;

public class Goblin extends Target{
    
    public Goblin(Size size, Visibility visibility) {
        setSize(size);
        setVisibility(visibility);
    }

    @Override
    public String toString() {
        return ("Size : " + getSize() + "Visibility: " + getVisibility());
    }
}
