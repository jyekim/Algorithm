import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        for (int i=1; i<=N; i++){
            String text = scan.nextLine();
            System.out.println(i+". "+text);
        }
    }
}
