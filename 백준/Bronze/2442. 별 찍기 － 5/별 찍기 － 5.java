
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=1;
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            for(int j=N-1; j>i; j--) {
                System.out.print(" ");
            }
            for(int K=0; K <num; K++){
                System.out.print("*");
            }
            num = num + 2;
            System.out.println();
        }
    }
}
