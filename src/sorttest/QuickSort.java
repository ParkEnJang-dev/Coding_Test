package sorttest;

public class QuickSort {


    public void quick(int[] arr, int first, int last) {
        System.out.println("first : " + first + " last : " + last);
        print(arr);

        if (first >= last) {
            return;
        }

        int pivot = first;
        int i = first + 1;
        int j = last;
        System.out.println("pivot : " + pivot + " i : " + i + " j : " + j);

        //교차 될때 까지
        while (i <= j) {
            while (i <= last && arr[i] <= arr[pivot]) i++;
            while (j > first && arr[j] >= arr[pivot]) j--;
            if (i > j) swap(arr, pivot, j);
            else swap(arr, i,j);

            System.out.println("swap result\n");
            print(arr);
        }
        System.out.println("pivot result\n");
        print(arr);

        quick(arr, first, j - 1);
        quick(arr, j+1, last);
    }


    void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    void print (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
