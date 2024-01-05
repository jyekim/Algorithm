import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());

        for(int i=0; i<t; i++){
            String text = scan.nextLine();
            String result = text.substring(0,1)+text.substring(text.length()-1);

            System.out.println(result);
        }
    }
}