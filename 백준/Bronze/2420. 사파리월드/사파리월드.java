import java.util.Scanner;

//사파리 월드
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long M = scan.nextLong();

        System.out.println(Math.abs(N-M));


    }
}

