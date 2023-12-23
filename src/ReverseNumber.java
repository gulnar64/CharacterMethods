import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
        int numb = scanner.nextInt();
        //14723 /10     %= 3     ==>> 3 * 1
        //1472 /10      %=2      ==>> 3 * 10 + 2 result
        //147 /10       %=7      ==>> (3* 10+ 2)*10 + 7
        //14 /10        %=4      ==>> ((3* 10+ 2)*10 + 7)*10 + 4
        //10/10         %=0      ==>> (((3* 10+ 2)*10 + 7)*10 + 4)*10 + 7
        int result = 0;
        while (numb != 0) {
            int remain = numb % 10;
            result = result * 10 + remain;
            numb /= 10;
        }
        System.out.println("reverse number: " + result);
    }
}
