package 문자열을정수로바꾸기;

import java.util.Arrays;
import java.util.StringTokenizer;

//codingTestLV_1_04
public class codingTestLV_1_04 {

    public static int solution(String s) {
        int answer = 0;
        if (s.indexOf("-") == 1) {
            answer = Integer.parseInt(s);
            return answer;
        }else
            return Integer.parseInt(s);
    }
//제한 조건
//s의 길이는 1 이상 5이하입니다.
//s의 맨앞에는 부호(+, -)가 올 수 있습니다.
//s는 부호와 숫자로만 이루어져있습니다.
//s는 "0"으로 시작하지 않습니다.
//입출력 예
//예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
//str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
    public static void main(String[] agrs){
        String s = "-1234";
        System.out.println("메인: " + solution(s));
    }
}
