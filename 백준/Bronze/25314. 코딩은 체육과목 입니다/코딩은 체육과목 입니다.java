import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int repeat = N/4;
        for(int i=0; i<repeat; i++){
            System.out.println("long");
        }
        System.out.println("int");
    }
}
