package SortingAlgorithms;


/*
*
* Selection Sort Algorithm is an UnStable Sort Algorithm i.e
*
* If the array contains same number's like 23,23 the position of the array might be change
*
* */
public class SelectionSortAlg {

    public static void main(String[] args) {

        int[] arrayElements = {32, 43, 15, -3, 343, 0, -25, 69, -55};

        /*
        * The Selection Sort contains two Loops to sort the element in an array
        * the time complexity for this Algorithm is quadratic i.e {T(n)=O(n^{2})}
        *
        * */
        for (int lastUnsortedIndex = arrayElements.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {

                if (arrayElements[i] > arrayElements[largest]) {
                    largest = i;
                }
            }
            swap(arrayElements, largest, lastUnsortedIndex);
        }
        for (int i = 0; i < arrayElements.length - 1; i++) {
            System.out.println(arrayElements[i]);
        }
    }

    public static void swap(int[] arrayElements, int largest, int lastUnsortedIndex) {

        int temp = arrayElements[largest];
        arrayElements[largest] = arrayElements[lastUnsortedIndex];
        arrayElements[lastUnsortedIndex] = temp;
    }
}
