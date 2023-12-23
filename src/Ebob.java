import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ededleri daxil edin: ");
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        while (numb2 != 0) {
            int temp = numb2;
            numb2 = numb1 % numb2;
            numb1 = temp;
        }
        System.out.println(numb1);
    }
}
