public class Triangle extends Shape{
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int x, int y, int x2, int y2, int x3, int y3) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public int getSide1() {
        return (int) Math.sqrt(Math.pow(x2-getX(),2) + Math.pow(y2-getY(),2));
    }

    public int getSide2() {
        return (int) Math.sqrt(Math.pow(x3-getX(),2) + Math.pow(y3-getY(),2));
    }

    public int getSide3() {
        return (int) Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2));
    }

    @Override
    public int area() {
        int p = perimetr()/2;
        return (int) Math.sqrt(p * (p - getSide1())*(p - getSide2())*(p - getSide3()));
    }

    @Override
    public int perimetr() {
        return getSide1() + getSide2() + getSide3();
    }
}
