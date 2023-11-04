// class Solution {
//     public int solution(int a, int b, int c) {
//         int answer = 0;
//         dice_1 = int a;
//         dice_2 = int b;
//         dice_3 = int c;
//         for (if int a != int b && int b != int c)
//             int(a+b+c);
//         }else if int a != int b
        
//         return answer;
//     }
// }


class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a==b&&b==c){
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }else if(a==b&&b!=c||a==c&&c!=b||a!=b&&b==c){
            answer = (a+b+c)*(a*a+b*b+c*c);
        }else{
            answer = a+b+c;
        }
        
        return answer;
    }
}