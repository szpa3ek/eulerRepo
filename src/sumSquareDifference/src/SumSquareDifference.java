package sumSquareDifference.src;

public class SumSquareDifference {

    public static void main(String[] args) {
        long sumOfSqrt = 0L;
        long sqrtOfSum = 0L;
        for (int i = 1; i <= 100; i++) {
            sumOfSqrt += Math.pow(i, 2);
            sqrtOfSum += i;
        }
        long powerOfSum = (long) Math.pow(sqrtOfSum, 2);
        System.out.println(powerOfSum - sumOfSqrt);
    }
}
