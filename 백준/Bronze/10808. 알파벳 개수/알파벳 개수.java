

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //System.out.println((int)'a');  -> 97나옴 이걸 활용해라
        Scanner scan = new Scanner(System.in);
        int []result = new int[26];
        char []temp = scan.next().toCharArray();
        for(int i=0; i< temp.length; i++){
            result[temp[i]-97]++;
        }
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+ " ");
        }
    }
}
