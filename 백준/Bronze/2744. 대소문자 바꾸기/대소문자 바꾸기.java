import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String answer = "";
        for (int i=0; i<a.length(); i++) {
            char index = a.charAt(i);
            if (index >= 65 && index <= 90) {
                answer += String.valueOf(index).toLowerCase();
            } else {
                answer += String.valueOf(index).toUpperCase();
            }
        }
        System.out.println(answer);
    }
}