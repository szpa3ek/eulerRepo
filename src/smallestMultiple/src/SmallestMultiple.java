package smallestMultiple.src;

import java.util.Arrays;

public class SmallestMultiple {

    public static void main(String[] args) {
        boolean isNumberFounded = false;
        long smallestNumber = 0;
        while (!isNumberFounded) {
            smallestNumber++;
            if (isDivisibleByAll(smallestNumber)) {
                System.out.println(smallestNumber);
                isNumberFounded = true;
            }
        }
    }

    // this is the fastest
    private static boolean isDivisibleByAll(long n) {
        boolean isDivisible = true;
        if (n % 7 != 0 || n % 11 != 0 || n % 13 != 0 || n % 15 != 0 || n % 16 != 0 || n % 17 != 0 || n % 18 != 0 || n % 19 != 0) {
            isDivisible = false;
        }
        return isDivisible;
    }

    private static int[] divisorsArray = {7, 11, 13, 15, 16, 17, 18, 19};
    // this is acceptable performance and readability
    private static boolean isDivisibleByAll2(long n) {
        for(int  i : divisorsArray) {
            if(n % i != 0) {
                return false;
            }
        }
        return true;
    }

    // this looks pretty but it's slow
    private static boolean slowIsDivisibleByAll(long n) {
        return Arrays.stream(divisorsArray).boxed().noneMatch(divisor -> n % divisor != 0);
    }
}
