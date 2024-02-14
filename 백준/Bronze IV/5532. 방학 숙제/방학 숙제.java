import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int spend_a = A/C;
        if(A%C!=0)spend_a++;
        int spend_b = B/D;
        if(B%D!=0)spend_b++;
        System.out.println(L-Math.max(spend_a,spend_b));


    }
}
