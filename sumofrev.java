class sumofrev {
    public static void main(String args[]) {
        System.out.println("Udit Vegad(216090307001)");
        System.out.println("-------------------------");
        System.out.println("Enter a Number:");
        int num = Integer.parseInt(System.console().readLine());
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10; 
        }
        System.out.println("Sum of the number is: " + sum);

    }
}
