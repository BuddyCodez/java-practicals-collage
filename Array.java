public class Array {
    public static void main(String[] args) {
        System.out.println("Udit Vead(216090307001)");
        System.out.println("-------------------------");
        System.out.println("Arrays In Java");
        System.out.println("-------------------------");
        int arr[] = new int[2];
        int size = 0;
        while (true) {
            System.out.println("1.Create\n2.Additon\n3.Min\n4.Max\n5.Display");
            System.out.print("Enter Your Choice:");
            int ch = Integer.parseInt(System.console().readLine());
            switch (ch) {
                case 1:
                    System.out.println("Enter Size of Array:");
                    size = Integer.parseInt(System.console().readLine());
                    arr = new int[size];
                    System.out.print("Enter " + size + " Elements:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.parseInt(System.console().readLine());
                    }
                    break;
                case 2:
                    int sum = 0;
                    for (int i = 0; i < size; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum = " + sum);
                    break;
                case 3:
                    int firstIndex = arr[0];
                    for (int i = 0; i < size; i++) {
                        if (arr[i] <= firstIndex) {
                            firstIndex = arr[i];
                        }
                    }
                    System.out.println("Minimum Element in Array is =" + firstIndex);
                    break;
                case 4:
                    int fIndex = arr[0];
                    for (int i = 0; i < size; i++) {
                        if (arr[i] >= fIndex) {
                            fIndex = arr[i];
                        }
                    }
                    System.out.println("Maximum Element in Array is =" + fIndex);
                    break;
                case 5:
                    for (int i = 0; i < size; i++) {
                        System.out.println(arr[i]);
                    }
                    break;
                default:
                    System.out.println("Enter  Correct Choice.");
                    break;
            }
        }
    }
}
