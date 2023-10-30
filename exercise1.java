import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        System.out.println("Please enter the values for the first 3x3 array:");
        int[][] array1 = readArray();
        
        System.out.println("Please enter the values for the second 3x3 array:");
        int[][] array2 = readArray();

        if (areArraysIdentical(array1, array2)) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }
    }

    public static boolean areArraysIdentical(int[][] array1, int[][] array2) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (array1[row][col] != array2[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] readArray() {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                array[row][col] = input.nextInt();
            }
        }
        return array;
    }
}
