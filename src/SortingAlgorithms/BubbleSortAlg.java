package SortingAlgorithms;


// This Bubble Sort will do Sorting in Ascending Order(From Lowest Value to Highest Value)
public class BubbleSortAlg {

    public static void main(String[] args) {

        int[] elements = {23, 53, -3, 522, -64, 898, 333, -335};

        /*
         * 1st For Loop will get the last Index of array to make the highest value in array should be at end of the array and
         * decrease the last index to unsorted Index
         *
         * 2nd for loop will iterate the elements from starting index till lastUnsortedIndex
         *
         * Inside 2nd for loop the if condition will compare the elements at index 0 & index 1 if value is greater call swap method to replace least index with least value
         *
         * */
        for (int lastUnSortedIndex = elements.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            for (int i = 0; i < lastUnSortedIndex; i++) {
                if (elements[i] > elements[i + 1]) {
                    swap(elements, i, i + 1);
                }
            }
        }
        System.out.println("Sorting the Values in Ascending Order: ");
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public static void swap(int[] intArray, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
