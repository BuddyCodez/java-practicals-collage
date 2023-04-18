class Practical_10 {
    final static double PI = 3.14;
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Udit Vegad(216090307001)");
        System.out.println("-------------------------");
        double radius = Double.parseDouble(System.console().readLine("Enter radius: "));
        double area = PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}