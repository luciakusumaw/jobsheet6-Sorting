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

        int[] b = {30, 20, 2, 8, 14};
        Sorting13 sortingdata2 = new Sorting13(b);
        System.out.println("Original array:");
        sortingdata2.print();
        sortingdata2.selectionSort();
        System.out.println("Sorted array (Selection Sort):");
        sortingdata2.print();
        System.out.println("-------------------------");
    }
}