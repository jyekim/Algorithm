
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<3; i++){
            int sh = scan.nextInt();
            int sm = scan.nextInt();
            int ss = scan.nextInt();
            int eh = scan.nextInt();
            int em = scan.nextInt();
            int es = scan.nextInt();

            if(ss>es){
                es+=60;
                em--;
            }
            es-= ss;

            if(sm>em){
                em+=60;
                eh--;
            }
            em-= sm;
            eh-=sh;

            System.out.println(eh + " "+ em + " " + es);

        }

    }
}
