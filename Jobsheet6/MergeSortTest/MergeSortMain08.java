package MergeSortTest;

public class MergeSortMain08 {
    public static void main(String[] args) {
        int data[] = {10, 40, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort : ");
        MergeSorting08 mSort = new MergeSorting08();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
}