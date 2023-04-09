package 정수의제곱근판별;//codingTestLV_1_02


public class codingTestLV_1_02 {
    public static long solution(long n) {
        long answer = 0;
        long x = (long)Math.sqrt(n);
            if (Math.pow(x,2) == n ) {
                answer = ((long)Math.sqrt(n)+1);
                answer=(long)(Math.pow(answer,2));
                System.out.println(answer);
                return answer;
            }else{

                 return -1;
            }

    }

    public static void main(String[] args){
        long n =3;
        solution(n);
    }
}
