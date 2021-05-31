public class Circle extends Shape{
    private int radius;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (3.14 * Math.pow(radius, 2));
    }

    @Override
    public int perimetr() {
        return (int) (2 * 3.14 * radius);
    }
}
