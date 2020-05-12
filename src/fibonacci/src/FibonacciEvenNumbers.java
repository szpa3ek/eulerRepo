package fibonacci.src;

public class FibonacciEvenNumbers {
    private static int limit = 4000000;

    public static void main(String[] args) {
        System.out.println(cleverApproach());
        System.out.println(lessCleverApproach());
    }

    private static int cleverApproach() {
        int sum = 0;
        int first = 1;
        int second = 1;

        while (first < limit) {
            first = first + second;
            second = first - second;
            if (first % 2 == 0)
                sum += first;
        }
        return sum;
    }

    private static int lessCleverApproach() {
        int sum = 0;
        int previousFib = 1;
        int fib = 1;
        while(fib < limit) {
            int temp = fib;
            fib = fib + previousFib;
            previousFib = temp;
            if((fib % 2) == 0) {
                sum += fib;
            }
        }
        return sum;
    }
}
