package _30_01_23_Arrays;

//make an array of length 22
// bypass the array with a loop and....
// calculate the sum of elements from the beginning to the end
// calculate the sum of elements from the end to the beginning
// calculate the sum of elements first with even and then with odd indexes
//calculate the sum so that the first and last are summed, then the second and penultimate element of array.

public class Task1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int sum1 = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum1 = sum1 + arr[i];

        }

        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum3 = sum3 + arr[i];
            } else {
                sum4 = sum4 + arr[i];
            }
        }

//version 1
        int sum5 = 0;
        for (int i = 0;  i < arr.length / 2; i++)
            for (int j = arr.length - 1; i < j ; j--) {
                sum5 = sum5 + arr[i] + arr[j];
                i++;

            }
//version 2
        int sum6 = 0;
        int min = arr[0];
        int max= arr.length;
        while (min <= max ) {
            sum6 = sum6 + min + max;
            min++;
            max--;
        }

        System.out.println("sum of elements from the beginning to the end: " + sum);
        System.out.println("sum of elements from the end to the beginning: " + sum1);
        System.out.println("sum of elements with even indexes: " + sum3);
        System.out.println("sum of elements with odd indexes: " + sum4);
        System.out.println("sum the first and last are summed, then the second and penultimate element of array: " + sum5);
        System.out.println("sum the first and last are summed, then the second and penultimate element of array: " + sum6);
    }

}

