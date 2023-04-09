package 자연수뒤집어서배열만들기;//codingTestLV_1_01
import java.util.Arrays;
     class codingTestLv_1_01 {
         public static int[] solution(long n) {
             String str = Long.toString(n);
             int[] answer = new int[str.length()];
             for (int i=0;i<str.length();i++) {
                 answer[i] = (int)(n%10); //2345 % 10 == 5
                 n /= 10; // n = n /10
             }
             System.out.println(Arrays.toString(answer));

             return answer;

         }

         public static void main(String[] args) {
             long n = 12345;
             solution(n);

         }
     }