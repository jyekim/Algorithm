import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);{
            int total = scan.nextInt();
            int N = scan.nextInt();
            int sum = 0;
            for( int i=0; i<N; i++){
                int price = scan.nextInt();
                int amount = scan.nextInt();
                sum += price*amount;
            }if (sum == total){
                System.out.println("Yes");
            }else System.out.println("No");
        }
    }
}
