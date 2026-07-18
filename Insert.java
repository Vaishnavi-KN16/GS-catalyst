import java.util.*;

public class Insert {

    static int[] insert(int[] arr, int[] elements, int[] positions) {

        int[] result = new int[arr.length + elements.length];

        
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        int currentSize = arr.length;

        for (int i = 0; i < elements.length; i++) {

            int pos = positions[i] - 1;   

           
            for (int j = currentSize; j > pos; j--) {
                result[j] = result[j - 1];
            }

            result[pos] = elements[i];
            currentSize++;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the original array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the original array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements to insert");
        int m = sc.nextInt();
        int[] elements = new int[m];
        int[] positions = new int[m];
        System.out.println("Enter the elements to insert");
        for (int i = 0; i < m; i++) {
            elements[i] = sc.nextInt();
            System.out.println("Enter the position to insert element " + elements[i]);
            positions[i] = sc.nextInt();
        }

        int[] result = insert(arr, elements, positions);
        System.out.println("Array after insertion: " + Arrays.toString(result));

        sc.close();
    }
}