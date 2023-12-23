import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
        int numb = scanner.nextInt();
        int sum = 0;
        for(int i=1;i<=numb/2;i++) {
            if(numb%i==0)
                sum +=i;
        }
        System.out.println(sum);
        if(sum==numb)
            System.out.println("This is perfect number");
    }
}
