
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A[] = {1,1,2,2,2,8};
        Scanner scan = new Scanner(System.in);
        for(int i =0; i<6; i++){
            System.out.print(A[i]- scan.nextInt()+" ");
        }
    }
}
