class Rectangle {
    int height;
    int width;
    Rectangle(int h, int w) {
        height = h;
        width = w;
    }
}
public class Practical_7 {
    public static void main(String[] args) {
        Rectangle rectangle_1 = new Rectangle(10, 20);
        System.out.println(rectangle_1.height + " " + rectangle_1.width);
    }
}
