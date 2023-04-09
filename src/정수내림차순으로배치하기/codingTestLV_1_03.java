package 정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//codingTestLV_1_03
public class codingTestLV_1_03 {
        public static long solution(long n) {
            long answer = 0;
            String[] str = Long.toString(n).split("");
            Arrays.sort(str, Collections.reverseOrder());	// 정렬 후 출력
            String temp = "";
            for(String s : str) {
                temp += s;
                answer = Long.parseLong(temp);
            }
            System.out.println(answer);
            return (long)answer;
    }



    public static void main(String[] args){
//      n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//      예를들어 n이 118372면 873211을 리턴하면 됩니다.
        long n =118372;
        System.out.println(solution(n));


    }

}
