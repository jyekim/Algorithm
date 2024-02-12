import java.util.Scanner;

//파티가 끝나고 난 뒤
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int P = scan.nextInt();
        int totalParticipants = L * P;

        for (int i = 0; i < 5; i++) {
            int temp = scan.nextInt();
            System.out.print(temp - totalParticipants + " ");
        }
    }
}
