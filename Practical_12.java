public class Practical_12 {
    public static class Shape {
        public int r;

        public Shape() {
            this(5);
        }

        public Shape(int radius) {
            this.r = radius;
        }

        public void display() {
            float area = (float) 3.14 * r * r;
            System.out.println("The area of the circle is: " + area);
        }
    }
    public static void main(String args[]) {
        System.out.println("Udit Vegad(7001)");
        Shape circle = new Shape();
        Shape circle2 = new Shape(10);
        circle.display();
        circle2.display();
    }
}
