import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] text = scan.nextLine().split("/");
        int K = Integer.parseInt(text[0]);
        int D = Integer.parseInt(text[1]);
        int A = Integer.parseInt(text[2]);

        if(K+A<D || D==0){
            System.out.println("hasu");
        }else {
            System.out.println("gosu");
        }
    }
}
