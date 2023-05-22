public class Practical_20 {
    public static abstract class shape {
        public abstract double area();
    }

    public static class circle extends shape {
        public double area() {
            System.out.println("Enter the radius of circle :-");
            
            int r = Integer.parseInt(System.console().readLine());
            double AOC = 3.14 * r * r;
            return AOC;
        }
    }

    public static class triangle extends shape {
        public double area() {
            System.out.println("Enter the height and base of traingle :-");
            
            int h = Integer.parseInt(System.console().readLine());
            int b = Integer.parseInt(System.console().readLine());
            double AOC = 0.5 * h * b;
            return AOC;
        }
    }

    public static class rectangle extends shape {
        public double area() {
            System.out.println("Enter the length and width of rectangle :-");
            int l = Integer.parseInt(System.console().readLine());
            int w = Integer.parseInt(System.console().readLine());
            double AOC = l * w;
            return AOC;
        }
    }

    public static void main(String args[]) {
        circle c1 = new circle();
        triangle t1 = new triangle();
        rectangle r1 = new rectangle();
        System.out.println("Udit  Vegad(216090307001)");
        System.out.println("Area of the circle is: " + c1.area());
        System.out.println("Area of the triangle is: " + t1.area());
        System.out.println("Area of the rectangle is: " + r1.area());
    }
}
