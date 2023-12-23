import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sozu daxil edin: ");
        String word = scanner.next();
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord.concat(String.valueOf(word.charAt(i)));
        }
        System.out.println(reverseWord);
        if (word.equals(reverseWord))
            System.out.println("word palindrome");
        boolean palindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() -1 - i)) {
                palindrome = false;
                break;
            }
        }
            System.out.println("word palindrome? " + palindrome);
    }
}
