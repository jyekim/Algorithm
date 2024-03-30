
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] numbers = new int[N];

        // 정수 입력 받기
        for(int i = 0; i < N; i++) {
            numbers[i] = scan.nextInt();
        }

        // 최솟값과 최댓값 초기화
        int min = numbers[0];
        int max = numbers[0];

        // 최솟값과 최댓값 구하기
        for(int i = 1; i < N; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        System.out.println(min + " " + max);
    }
}
