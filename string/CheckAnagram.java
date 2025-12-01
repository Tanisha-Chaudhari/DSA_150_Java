package string;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = sc.next();

        System.out.print("Enter 2nd string: ");
        String str2 = sc.next();

        if (str1.length() != str2.length()) {
            System.out.println("Not a anagram");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedarr1 = new String(arr1);
        String sortedarr2 = new String(arr2);

       if(sortedarr1.equals(sortedarr2)){
           System.out.println("Anagram");
       }else{
           System.out.println("not a anagram");
       }
    }
}
