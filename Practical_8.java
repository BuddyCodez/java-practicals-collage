class Rectangle {
    int height;
    int width;

    Rectangle() {
        this(0, 0);
    }

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    void display() {
        System.out.println("Width of Rectangle is: " + width);
        System.out.println("Height of Rectangle is: " + height);
    }
}

public class Practical_8 {
    public static void main(String[] args) {
          System.out.println("-------------------------");
        System.out.println("Udit Vegad(216090307001)");
        System.out.println("-------------------------");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 20);
        r1.display();
        r2.display();
    }
}
