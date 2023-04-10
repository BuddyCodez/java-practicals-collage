public class MultiDArray {
    public static void main(String[] args) {
        System.out.println("Udit Vead(216090307001)");
        System.out.println("-------------------------");
        System.out.println("2d Arrays In Java");
        System.out.println("-------------------------");
        int arr[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int arr3[][] = new int[3][3];
        while (true) {
            System.out.println("1.Create\n2.Display\n3.Add\n4.Exit\n");
            System.out.print("Enter Your Choice:");
            int ch = Integer.parseInt(System.console().readLine());
            switch (ch) {
                case 1:
                    System.out.print("Enter Elements of Matrix:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            arr[i][j] = Integer.parseInt(System.console().readLine());
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.print("Enter Elements of 2nd Matrix:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            arr2[i][j] = Integer.parseInt(System.console().readLine());
                        }
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            arr3[i][j] = arr[i][j] + arr2[i][j];
                        }
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr3[i][j] + " ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter  Correct Choice.");
                    break;
            }
        }
    }
}
