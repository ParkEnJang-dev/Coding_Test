package sorttest;

import java.util.List;

public class MergeSort {

    public static void main(String[] args) {

       int[] array = {21, 10, 12, 20, 25, 13, 15, 22, 5};
        mergeSort(array);
    }

    public static void mergeSort(int[] array) {
        System.out.println(array.length/2);

        if (array.length < 0 || array.length == 1) {
            return;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        int liftIdx = 0;
        int rightIdx = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < mid) {
                left[liftIdx++] = array[i];
            } else {
                right[rightIdx++] = array[i];
            }
        }


        mergeSort(left);
        mergeSort(right);
    }

}
