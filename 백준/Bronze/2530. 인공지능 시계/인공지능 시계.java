import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();
        int time = scan.nextInt();

        //초분시로 계산하기

        s+= time;
        if(s>59){
            m+=s/60; //s가 60초를 넘어가는 순간 분으로 넘길 수 있게
            s=s%60;
        }
        if(m>59){
            h+=m/60;
            m=m%60;
        }
        if(h>23){
            h=h%24;
        }
        System.out.println(h+" "+m+ " "+ s);

    }
}
