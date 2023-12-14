import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row_num = scan.nextInt();
        for(int i= 1; i <= row_num; i++){
            for(int j = 1; j < i+1 ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}