import java.util.Scanner;

public class PyramidTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
        int numb = scanner.nextInt();
        for(int i=1;i<= numb;i++) {
//            for(int j=1; j<=numb-i;j++) {
//                System.out.print(" ");
//            }
            for(int j=1; j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
