public class Practical_3 {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Udit Vegad(216090307001)");
        System.out.println("-------------------------");
        int number = Integer.parseInt(System.console().readLine("Enter a number: "));
        // reverse this number using while loop
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10; // shift the digits to the left eg 123 becomes 1230
            reverse = reverse + number % 10; // add the last digit to the right eg 1230 + 3 = 1233
            number = number / 10; // remove the last digit eg 123 becomes 12
        }
        System.out.println("Reverse of entered number is " + reverse);
    }
}
