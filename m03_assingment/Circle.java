public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean isFilled) {
        this.radius = radius;
        setColor(color);
        setFilled(isFilled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public boolean equals(Object otherCircle) {
        return this.compareTo((Circle)otherCircle) == 0;
    }

    @Override
    public int compareTo(Circle otherCircle) {
        if (this.radius > otherCircle.radius)
            return 1;
        else if (this.radius < otherCircle.radius)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDate created: " + getDateCreated() +
            "\nRadius: " + radius;
    }
}
