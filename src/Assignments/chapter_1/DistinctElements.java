package Assignments.chapter_1;

public class DistinctElements {

    // This method find's if the array contains any repeated elements return boolean value
    public boolean isDistinctElements(float[] elements) {

        int count = 1;// this count increase the indexNumber after comparing with previous index
        for (int x = 0; x < elements.length - 1; x++) {

            for (int y = count; y < elements.length - 1; y++) {
                if (elements[x] == elements[y]) {
                    return false;
                }
            }
            count++;
        }
        return true;
    }
}
