import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sozu daxil edin: ");
        String word = scanner.next();
        for (int i = 0; i < word.length(); i++) {
            boolean isUsed = false;
            for (int j = 0; j < i; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    isUsed = true;
                    break;
                }
            }
            int count = 0;
            if (!isUsed) {
                for (int j = i; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(word.charAt(i) + " simvolu " + count + " defe istifade olunub");

            }
        }
    }
}
