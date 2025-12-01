package string;
import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Step 1: Create HashMap to store character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Step 2: Loop through string to populate frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        // Step 3: Loop again to find first non-repeating character
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freqMap.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}
