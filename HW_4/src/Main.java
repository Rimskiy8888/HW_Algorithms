import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] m = {100, 112, 256, 349, 770};
        int[] n = {72, 86, 113, 119, 265, 445, 892};
        int[] array = new int[12];
        int k = 9;

        int leftIndex = 0;
        int rightIndex = 0;
        int mainIndex = 0;
        while (leftIndex < m.length && rightIndex < n.length) {
            if (m[leftIndex] < n[rightIndex]) {
                array[mainIndex++] = m[leftIndex++];
            } else {
                array[mainIndex++] = n[rightIndex++];
            }

        }
        while (leftIndex < m.length) {
            array[mainIndex++] = m[leftIndex++];
        }
        while (rightIndex < n.length) {
            array[mainIndex++] = n[rightIndex++];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array[k - 1]);

    }

}
