import java.util.*;

public class array_sum {

    // Pure logic — takes an array, returns the sum
    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = sumOfArray(arr);
        System.out.println("Sum of array elements: " + result);

        sc.close();
    }
}
/*int sum = Arrays.stream(arr).sum(); */