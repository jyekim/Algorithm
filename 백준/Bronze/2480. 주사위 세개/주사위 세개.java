import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b && b == c) { //같은 눈이 3개일 경우
            System.out.println(10000 + a * 1000);
        } else if(a==b || b==c || c==a) { //같은 눈이 2개일 경우
            if (a == b) {
                System.out.println(1000 + a * 100);
            } else {
                System.out.println(1000 + c * 100);
            }
        }else{
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        }
    }
}
