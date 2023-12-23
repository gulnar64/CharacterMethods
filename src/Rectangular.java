import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enini daxil edin: ");
        int numb1 = scanner.nextInt();
        System.out.print("Uzununu daxil edin: ");
        int numb2 = scanner.nextInt();
        for (int i = 1; i <= numb1; i++) {
            for (int j = 1; j <= numb2; j++) {
                if (i == 1 || j == 1 || i == numb1 || j == numb2)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
