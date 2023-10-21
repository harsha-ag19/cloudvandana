public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input.toLowerCase());

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create an array to keep track of whether each letter is present
        boolean[] alphabet = new boolean[26];

        // Iterate through the characters in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is an English lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Mark the corresponding letter as present
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all letters have been marked as present
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                return false;
            }
        }

        return true;
    }
}