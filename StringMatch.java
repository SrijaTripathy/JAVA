public class StringMatch {

    public static void main(String[] args) {
        String text = "ABCDCDEF";
        String pattern = "CDE";

        int index = bruteForceSearch(text, pattern);

        if (index != -1) {
            System.out.println("Pattern found at index " + index);
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }

    public static int bruteForceSearch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();

        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;
            for (j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break; // Character mismatch, move to the next position in the text
                }
            }
            if (j == patternLength) {
                return i; // Pattern found at position i in the text
            }
        }

        return -1; // Pattern not found in the text
    }
}
