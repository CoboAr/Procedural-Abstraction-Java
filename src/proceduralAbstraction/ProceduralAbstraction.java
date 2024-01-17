
package proceduralAbstraction;

/**
 *
 * @author acobo
 */
public class ProceduralAbstraction {

    //Requires: None
    //Modifies: None
    //Effects: Returns the smallest positive integer n for which n!
    // (i.e. 1*2*3*...*n) is greater than or equal to x, for positive
    // integer x. Otherwise returns 1.

    public static int reverseFactorial(int x){

        if (x > 0) {
            int n=1;
            int result = 1;

            while (result < x){
                n=n+1;
                result = result * n;
            }
            return n;
        }
        else{
            return 1;
        }
    }

    //Requires: None
    //Modifies: None
    //Effects: If the matrix arr satisfies Nice property, prints the sum and
    // returns true. Otherwise returns false.

    public static boolean isMatrixNice(int[][]arr){

        if (arr.length != arr[0].length){   // matrix is not square
            return false;
        }
        else if (arr == null){  // matrix is null
            return false;
        }

        //check the sum of the first diagonal startin at arr[0][0]
        int first_diagonal = 0;
        for (int i = 0; i < arr.length; i++){
            first_diagonal = first_diagonal + arr[i][i];
        }

        // check the sum of second diagonal starting at arr[arr.length-1][0]
        int second_diagonal = 0;
        for (int j = 0; j < arr.length; j++){
            second_diagonal = second_diagonal + arr[arr.length-j-1][j];
        }

        //compare the sum of first_diagonal and second_diagonal
        //return false if sum is not equal

        if (first_diagonal != second_diagonal){
            return false;
        }

        //check the sum of each column and compare it with sum of first_diagonal

        for(int i = 0; i < arr.length; i++){
            int col = 0;
            for (int j = 0; j < arr.length; j++){

                col = col + arr[i][j];
            }
            if(col != first_diagonal){
                return false;
            }
        }

        //check the sum of each row and compare it with sum of first_diagonal
        for (int l = 0; l < arr.length; l++){
            int row = 0;
            for (int k = 0; k < arr.length; k++){

                row = row + arr[k][l];

            }

            if(row != first_diagonal){
                return false;
            }
        }

        // sum of NiceMatrix

        int sum = 0;
        int i,j;

        for (i=0; i < arr.length; i++){
            for (j = 0; j < arr.length; j++){
                sum = sum + arr[i][j];
            }
        }

        System.out.printf("The sum of the entire matrix is: %d\n", sum);
        System.out.printf("The sum of each row, column and diagonal is %d\n", first_diagonal);
        return true;

    }

    public static void main (String[] args){

        // testing reverseFactorial procedure
        System.out.println("The reverse factorial of 0, is: " + reverseFactorial(0));
        System.out.println("The reverse factorial of -1, is: " + reverseFactorial(-1));
        System.out.println("The reverse factorial of -100, is: " + reverseFactorial(-100));
        System.out.println("The reverse factorial of 4, is: " + reverseFactorial(4));
        System.out.println("The reverse factorial of 7, is: " + reverseFactorial(7));
        System.out.println("The reverse factorial of 44, is: " + reverseFactorial(44));
        System.out.println("The reverse factorial of 444, is: " + reverseFactorial(444));
        System.out.println("The reverse factorial of 4444, is: " + reverseFactorial(4444));

        int [][]nice = new int [][]{{4, 14, 12},{18, 10, 2},{8, 6, 16}};
        int [][]not_nice = new int[][]{{-6, 2, 0}, {8, -6, 8}, {14, -18, 0} };
        int [][]not_square = new int[][]{{-6, 2}, {8, -6, 8}, {14, -18, 0} };
        int [][] test_null = new int[][]{{},{},{}};

        //testing isMatrixNice procedure
        System.out.println("\n\nTesting the first Matrix which is a Nice matrix.");
        boolean Nice = isMatrixNice(nice);
        System.out.printf("The returning value is: %b.", Nice);

        System.out.println("\n\nTesting the second Matrix which is not a Nice matrix.");
        boolean Not_Nice = isMatrixNice(not_nice);
        System.out.printf("The returning value is: %b.", Not_Nice);

        System.out.println("\n\nTesting the third Matrix which is a null matrix.");
        boolean Test_Null = isMatrixNice(test_null);
        System.out.printf("The returning value is: %b.", Test_Null);

        System.out.println("\n\nTesting the fourth Matrix which is a not square matrix.");
        boolean Not_Square = isMatrixNice(not_square);
        System.out.printf("The returning value is: %b.", Not_Square);
    }
}