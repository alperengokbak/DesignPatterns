package lab1;

public abstract class ThreeDimShape extends Shape{
    private String shapeType;
    
    public ThreeDimShape(String shapeType, String name) {
        super(name);
        this.shapeType = shapeType;
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

}

