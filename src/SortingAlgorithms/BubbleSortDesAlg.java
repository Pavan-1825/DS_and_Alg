package SortingAlgorithms;

public class BubbleSortDesAlg {

    public static void main(String [] args){


        int [] arrayToSort = {23, 53, -3, 522, -64, 898, 333, -335};

        for (int lastUnSortedIndex = arrayToSort.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            for (int i = 0; i < lastUnSortedIndex; i++) {
                if (arrayToSort[i] < arrayToSort[i + 1]) { // this Condition makes the Sorting in Descending Order
                    swap(arrayToSort, i, i + 1);
                }
            }
        }
        System.out.println("Sorting the Values in Descending Order: ");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i]);
        }
    }

    public static void swap(int[] arrayToSort, int i, int j){
        if (i==j){
            return;
        }
        int temp = arrayToSort[i];
        arrayToSort[i] = arrayToSort[j];
        arrayToSort[j] = temp;
    }
}
