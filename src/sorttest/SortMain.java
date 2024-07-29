package sorttest;

public class SortMain {
    public static void main(String[] args) {
        int data[] = {54, 34, 41, 89, 67, 16, 53, 23};
        QuickSort quickSort = new QuickSort();
        quickSort.quick(data, 0, data.length - 1);
    }
}
