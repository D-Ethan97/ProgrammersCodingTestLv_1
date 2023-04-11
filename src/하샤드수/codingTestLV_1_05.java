package 하샤드수;

public class codingTestLV_1_05 {
    public static boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        String[] arr = str.split("");
        int y=0;
        for(String s : arr) {
            y += Integer.parseInt(s);
            System.out.println(y);
        }
        if (x % y == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args){
        int x = 11;
        System.out.println(solution(x));
    }
}
