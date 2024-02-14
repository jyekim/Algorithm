import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            String text = scan.nextLine();
            if(text.equals("END")) break;
            char[] textArr = text.toCharArray();
            for(int i= textArr.length-1; i>=0; i--){
                System.out.print(textArr[i]);
            }
            System.out.println();
        }
    }
}