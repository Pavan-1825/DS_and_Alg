package Assignments.chapter_1;

public class RemovePunctuations {



    //  Time complexity for this method is O(n2)
    public static String removePunctuations(String punc) {

        char[] isPresent = {'.', ',', '?', ']', '[', '(', ')', '/', ';', ':', '-', '!', '{', '}', '*', '%', '|', '\''};// we can include any other's pantuations if needed

        StringBuilder stringBuilder = new StringBuilder(punc);

        for (int x = 0; x < stringBuilder.length(); x++) {

            for (int y = 0; y <= isPresent.length - 1; y++) {

                if (stringBuilder.charAt(x) == isPresent[y]) {
                    stringBuilder.deleteCharAt(x);
                }
            }
        }
        return stringBuilder.toString();
    }
}
