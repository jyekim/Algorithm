
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        // 만약에 M이 45분 이상이면, M에서 45분 뺌        
        if (M >= 45) {
            M -= 45;
        } else {
            H -= 1;
            M += 15;  // M에 60에서 45분을 뺀 값인 15를 더함.
            if (H < 0) {
                H = 23;
            }
        }

        System.out.println(H + " " + M);
    }
}