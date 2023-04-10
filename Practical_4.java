public class Practical_4 {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Udit Vegad(216090307001)");
        System.out.println("-------------------------");
        // take a 3x3 matrix from the user
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(System.console().readLine("Enter a number: "));
            }
        }
        // take another 3x3 matrix from the user
        int[][] matrix_2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix_2[i][j] = Integer.parseInt(System.console().readLine("Enter a number: "));
            }
        }
        // add the two matrices
        int[][] matrix_3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix_3[i][j] = matrix[i][j] + matrix_2[i][j];
            }
        }
        // print the result
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix_3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
