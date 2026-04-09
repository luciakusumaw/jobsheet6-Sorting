package week05; 
public class SortingMain13 {
    public static void main(String[] args) { 
        int[] a = {34, 7, 23, 32, 5, 62};
        
        Sorting13 sortingdata = new Sorting13(a);
        System.out.println("Original Array: ");
        sortingdata.print();
        sortingdata.bubbleSort();
        System.out.println("Sorted array (bubble sort): ");
        sortingdata.print();
    }
}