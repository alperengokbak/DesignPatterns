package lab1;

public class Cube extends ThreeDimShape implements ThreeDimCalculations{

    private int line;
    
    public Cube(String shapeType, String name, int line) {
        super(shapeType, name);
        this.line = line;
    }



    public int getLine() {
        return line;
    }



    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public double volume() {
        int volume = this.line * this.line * this.line;
        return volume;
    }
}
