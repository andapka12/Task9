public abstract class Quadrangle {
    int a;
    int b;
    String color;

    public Quadrangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }
    public  abstract double getLargeDiagonal();
    public abstract  double getHeight();
    public  abstract String getColor();
}
//целочисленная переменная a — сторона a (боковые стороны);
//целочисленная переменная b — сторона b (нижняя и верхняя стороны);
//строковая переменная color;
//конструктор, принимающий все эти значения (int a, int b, String color);
//абстрактный метод getLargeDiagonal(), возвращающий вещественное (double) число — большую диагональ;
//абстрактный метод getHeight(), возвращающий вещественное (double) число — высоту четырехугольника;
//абстрактный метод getColor(), возвращающий строку — цвет.