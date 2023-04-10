public class Practical_2 {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Udit Vegad(216090307001)");
        System.out.println("-------------------------");
        int number_1 = Integer.parseInt(System.console().readLine("Enter number 1: "));
        int number_2 = Integer.parseInt(System.console().readLine("Enter number 2: "));
        int number_3 = Integer.parseInt(System.console().readLine("Enter number 3: "));
        if (number_1 > number_2 && number_1 > number_3) {
            System.out.println(number_1 + " is the largest");
        } else if (number_2 > number_1 && number_2 > number_3) {
            System.out.println(number_2 + " is the largest");
        } else if (number_3 > number_1 && number_3 > number_2) {
            System.out.println(number_3 + " is the largest");
        } else {
            System.out.println("All numbers are equal");
        }
    }
}
