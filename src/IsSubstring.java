import java.util.Scanner;

public class IsSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sozleri daxil edin: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String main, substring;
        if (word1.length() > word2.length()) {
            main = word1;
            substring = word2;
        } else {
            main = word2;
            substring = word1;
        }
        for (int i = 0; i <= main.length() - substring.length(); i++) {
            if (main.substring(i, i + substring.length()).equals(substring)) {
                System.out.println("Substring eynidir");
                break;
            }
        }
    }
}
