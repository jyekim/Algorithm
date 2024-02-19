import java.util.Scanner;

//과목선택
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int min_a = Integer.MAX_VALUE;
        int min_b = Integer.MAX_VALUE;

        for(int i =0; i<4; i++){
            int temp = scan.nextInt();
            sum += temp;
            if(temp < min_a) min_a =temp;
        }

        for(int i =0; i<2; i++){
            int temp = scan.nextInt();
            sum += temp;
            if(temp < min_b) min_b =temp;
        }
        System.out.println(sum-min_a-min_b);


    }
}
