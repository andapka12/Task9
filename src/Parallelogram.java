public class Parallelogram extends Quadrangle implements Figure {
    public Parallelogram(int a, int b, String color) {
        super(a, b, color);
    }

    double alpha;
    double beta;

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return Math.max(a,b) * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double getLargeDiagonal() {
        double d1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * b * a * Math.cos(Math.toRadians(alpha)));
        double d2 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * b * a * Math.cos(Math.toRadians(beta)));


        return Math.max(d1, d2);
    }

    @Override
    public double getHeight() {
        return Math.min(a * Math.sin(Math.toRadians(alpha)), b * Math.sin(Math.toRadians(beta)));
    }

    @Override
    public String getColor() {
        return color;
    }

}
//щественная переменная (double) alpha (левый нижний угол параллелограмма в градусах);
//вещественная переменная (double) beta (левый верхний угол параллелограмма в градусах);
//должен быть конструктор, принимающий значения (int a, int b, double alpha, double beta, String color);
//метод getLargeDiagonal() возвращает double — большую диагональ параллелограмма (формулы есть в интернете,
// чтобы использовать тригонометрическую функцию, используйте Math.cos() или Math.sin());
//метод getColor() возвращает строку — color;
//метод getHeight() возвращает double — МЕНЬШУЮ высоту параллелограмма;
//метод getArea() возвращает double — площадь параллелограмма;
//метод getPerimeter() возвращает double — периметр параллелограмма.