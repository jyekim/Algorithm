import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //R1+R2 = S*2
        //R2 = S*2- R1
        Scanner scan = new Scanner(System.in);
        int R1 = scan.nextInt();
        int S = scan.nextInt();
        System.out.println(S*2-R1);
    }
}
