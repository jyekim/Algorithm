import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int N = scan.nextInt();
        int M = scan.nextInt();
        int result = K*N -M;
        if(result<0) result=0;
        System.out.println(result);
    }
}