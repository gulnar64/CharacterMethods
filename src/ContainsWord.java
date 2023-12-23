import java.util.Scanner;

public class ContainsWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sozleri daxil edin: ");
        String word1 = scanner.next(); //istifade
        String word2 = scanner.next(); //et
        for (int i = 0; i < word2.length(); i++) {
            boolean charContain = false;
            for (int j = 0; j < word1.length(); j++) {
                if (word2.charAt(i) == word1.charAt(j)) {
                    charContain = true;
                    break;
                }
            }
            if (!charContain) {
                System.out.println("Herfler uyghun deyil");
                break;
            } else if (i == word2.length() - 1) {
                System.out.println("Herfler uyghundur");
            }
        }
    }
}
