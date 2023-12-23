import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
        int numb = scanner.nextInt();
        int numb1 = numb, numb2 = numb;
        //153 = 1^3 + 5^3 + 3^3
        //1634 = 1^4+6^4+3^4+4^4
        int count = 0;
        while (numb != 0) {
            count++;
            numb /= 10;
        }
        int result = 0;
        while (numb2 != 0) {
            int remain = numb2 % 10;
            int multiplacition=1;
            for(int i=1;i<=count;i++) {
                multiplacition *= remain;
            }
            result += multiplacition;
//            result += Math.pow(remain,count);
            numb2 /= 10;
        }
        System.out.println(result);

    }
}
