package lab5;

import java.util.Scanner;

public class RecursiveExercise {
    public static int countEven(int[] array, int index) {

        if (index == array.length) {
            return 0;
        }


        int count = (array[index] % 2 == 0) ? 1 : 0;


        return count + countEven(array, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many elements do you want: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.print("Please enter numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();

        }
        int result = countEven(numbers, 0);
        System.out.println("Number of even elements: " + result);

        scanner.close();

    }

}
