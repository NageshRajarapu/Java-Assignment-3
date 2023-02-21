import java.util.Scanner;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        /* 1.WAP to reverse a String.
             Input: “iNeuron”
             Output: “norueNi”
        */

        String input = "iNeuron";
        String output = "";
        for(int i=input.length()-1; i>=0; i--) {
            output = output + input.charAt(i);
        }
        System.out.println(input);
        System.out.println(output);
        System.out.println();

        /* 2. WAP to reverse a sentence while preserving the position.
            Input : “Think Twice”
            Output : “kniht eciwt”
        */

        String originalString = "Think Twice";
        String helpString = "";
        for(int i=originalString.length()-1;i>=0;i--) {
            helpString = helpString + originalString.charAt(i);
        }
        String reverseString[] = helpString.split(" ");
        String resultString = "";
        for(int j=reverseString.length-1;j>=0;j--) {
            resultString = resultString + reverseString[j] + " ";
        }
        System.out.println(originalString);
        System.out.println(resultString.toLowerCase());
        System.out.println();*/

        /* 3. WAP to check if the String is Anagram or not. */

        String s1 = "listen";
        String s2 = "silent";

        if (isAnagram(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        public static boolean isAnagram(String s1, String s2) {
            
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            if (s1.length() != s2.length()) {
                return false;
            }

            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            for (int i = 0; i < s1Array.length; i++) {
                if (s1Array[i] != s2Array[i]) {
                    return false;
                }
            }

            return true;
        }

        /* 4. WAP to check if the String is a Pangram or not. */

        String str = "The quick brown fox jumps over the lazy dog.";
        if (isPangram(str)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
        public static boolean isPangram(String str) {
            // convert the string to lowercase
            str = str.toLowerCase();
            // store the alphabet in an array
            char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            // loop through the alphabet
            for (char c : alphabet) {
                // check if the character is present in the string
                if (!str.contains(String.valueOf(c))) {
                    return false;
                }
            }
            return true;
        }

        /* 5. WAP to print repeatedly occurring characters in the given String.*/

        String s = "hello world";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
                if (s.indexOf(c, i + 1) != -1) {
                    if (s.indexOf(c) == i) {
                        System.out.println("Character '" + c + "' occurs repeatedly.");
                    }
                }
            }
        }

        /* 6. WAP to sort a String Alphabetically. */
        
	Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string to sort alphabetically: ");
        String sortstr = scan.nextLine();
        char charArray[] = sortstr.toCharArray();
        int sortsize = charArray.length;
        int temp;
        for(int i=0; i<sortsize; i++) {
            for(int j=0; j<sortsize; j++) {
                if(charArray[I]<charArray[j]) {
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = (char)temp;
                }
            }
        }
        System.out.println(sortstr);
        System.out.println(charArray);
        System.out.println();

        /* 7. WAP to count the number of Vowels and Consonants of a String value. */
        
	String instr = "nageshrajarapu";
        int cntVowel = 0;
        int cntCons = 0;
        for(int i=0; i<instr.length(); i++) {
            if(instr.charAt(i)=='a' || instr.charAt(i)=='A' || instr.charAt(i)=='e' || instr.charAt(i)=='E' ||                                  instr.charAt(i)=='i' || instr.charAt(i)=='I' || instr.charAt(i)=='o' || instr.charAt(i)=='O' ||                                  instr.charAt(i)=='u' || instr.charAt(i)=='U')
                cntVowel++;
            else
                cntCons++;
        }
        System.out.println("Vowels: " +cntVowel + "\nConsonants: " +cntCons);
        System.out.println();

        /* 8. WAP to count number of special characters. */
        
	String splstr = "nagesh@@#gmail@.com";
        int splcount = 0;
        for(int i=0; i<splstr.length(); i++) {
            if(splstr.charAt(i)>='a' && splstr.charAt(i)<='z' || splstr.charAt(i)>='A' && splstr.charAt(i)<='Z' ||                                splstr.charAt(i)>='0' && splstr.charAt(i)<='9')
                continue;
            else
                splcount++;
        }
        System.out.println(splcount);
    }
}