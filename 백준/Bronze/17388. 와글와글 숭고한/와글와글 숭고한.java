import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int K = scan.nextInt();
        int H = scan.nextInt();

        if(K+S+H>=100){
            System.out.println("OK");
        } else if (S<K && S<H) {
            System.out.println("Soongsil");
        } else if (K<S && K<H) {
            System.out.println("Korea");
        }else {
            System.out.println("Hanyang");
        }
    }

}
