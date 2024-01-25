import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        for(int i=0; i<5; i++){
            if(num == scan.nextInt()) count++;
        }
        System.out.println(count);
    }
}

