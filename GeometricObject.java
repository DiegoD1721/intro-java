public abstract class GeometricObject {
    private String color = "white";
    private boolean isFilled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean isFilled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\nColor: " + color +
            " and Filled: " + isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
