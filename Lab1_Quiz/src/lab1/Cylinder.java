package lab1;

public class Cylinder extends ThreeDimShape implements ThreeDimCalculations{
    private int r;
    private int h;
    
    public Cylinder(String shapeType, String name, int r, int h) {
        super(shapeType, name);
        this.r = r;
        this.h = h;
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double volume() {
        int volume = (int) (2 * Math.PI*this.r * (this.r+this.h));
        return volume;
    }
}
