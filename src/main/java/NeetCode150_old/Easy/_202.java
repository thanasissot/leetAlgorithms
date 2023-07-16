package NeetCode150_old.Easy;

public class _202 {

    public static boolean isHappy(int n) {
        if (n == 1) return true;
        int fast = n;
        int slow = n;
        while ( slow != 1 && fast != 1 ) {
            slow = getSquaredDigitsSum(slow);
            fast = getSquaredDigitsSum(getSquaredDigitsSum(fast));
            if (slow ==  fast && slow != 1 && fast != 1){
                return false;
            }
        }
        return true;
    }

    public static int getSquaredDigitsSum(int n) {
        int sum = 0;
        while ( n > 0 ) {
            sum += (int) Math.pow(n%10, 2);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
