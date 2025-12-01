package string;

import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
//Create HashMap to store character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();

        //Loop through each character
        for(char ch: str.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }

        //Print frequencies
        for (char key:freqMap.keySet()){
            System.out.println(key+" --> "+freqMap.get(key));
        }
    }
}
