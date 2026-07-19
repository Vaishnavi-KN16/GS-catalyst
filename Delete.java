import java.util.*;

public class Delete {
    static int[] delete(int[] arr, int[] positions) {

        Arrays.sort(positions);

        int currentSize = arr.length;

        for (int i = positions.length - 1; i >= 0; i--) {
            int pos = positions[i] - 1;

            for (int j = pos; j < currentSize - 1; j++) {
                arr[j] = arr[j + 1];
            }

            currentSize--;
        }

        int[] result = new int[currentSize];

        for (int i = 0; i < currentSize; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}