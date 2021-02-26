package pa.lab1.optional;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        try {
            // Parse the string argument into an integer value.
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException nfe) {
            // The first argument isn't a valid integer.  Print
            // an error message, then exit with an error code.
            System.out.println("The first argument must be an integer.");
            System.exit(1);
            // http://courses.cms.caltech.edu/cs11/material/java/donnie/java-main.html#:~:text=For%20example%2C%20to%20convert%20args,num%20%3D%20Integer.
        }
        int[][] matrix = new int[n][n];
        int random = (int) (Math.random() * 2);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random;
                matrix[j][i] = random;  //matrix has to be symmetrical
                if (i == j)
                    matrix[i][j] = 0; //all principal diagonal elements have to be 0
                random = (int) (Math.random() * 2);
            }
        }
        for (int[] i : matrix)
            System.out.println(Arrays.toString(i)); //for each loop

        VerifyConnectivity verifyConnectivity= new VerifyConnectivity();
        verifyConnectivity.bfs(matrix, 1);

    }
}
