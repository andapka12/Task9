public class Square extends Quadrangle implements Figure {
    public Square(int a, int b, String color) {
        super(a, b, color);
    }

    public Square(int a, String color) {
        super(a, a, color);
    }


    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(2) * a;
    }  //корень из 2 умноженный на сторону

    @Override
    public double getHeight() {
        return a;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }
}
