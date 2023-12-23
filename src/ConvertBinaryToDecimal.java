import java.util.Scanner;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
        int numb2 = scanner.nextInt();
        int cnt = 0;
        int numb10=0;
        while(numb2!=0) {
            int remain = numb2%10;
            numb10 += remain*Math.pow(2,cnt);
            numb2 /=10;
            cnt++;
        }
        System.out.println(numb10);
    }
}
