
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int burger1 = scan.nextInt();
        int burger2 = scan.nextInt();
        int burger3 = scan.nextInt();

        int coke = scan.nextInt();
        int cider = scan.nextInt();
        int minBurger = Math.min(Math.min(burger1,burger2),burger3);

        int totalPrice = minBurger + Math.min(coke, cider)-50;
        System.out.println(totalPrice);

    }
}
