public class Square extends Shape {
    private int side;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public int perimetr() {
        return 4 * side;
    }
}
