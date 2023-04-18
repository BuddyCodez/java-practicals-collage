class Shape {
    float area;

    void area(float radius) {
        this.area = 3.14f * radius * radius;
        System.out.println("Area of circle: " + this.area);
    }

    void area(float length, float breadth) {
        this.area = length * breadth;
        System.out.println("Area of rectangle: " + this.area);
    }

}

public class Practical_11 {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Udit Vegad(216090307001)");
        System.out.println("-------------------------");
        Shape shape = new Shape();
        float radius = Float.parseFloat(System.console().readLine("Enter radius: "));
        shape.area(radius);
        float length = Float.parseFloat(System.console().readLine("Enter length: "));
        float breadth = Float.parseFloat(System.console().readLine("Enter breadth: "));
        shape.area(length, breadth);
    }
}
