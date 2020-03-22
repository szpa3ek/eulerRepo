public class FibonacciEvenNumbers {

    public static void main(String[] args) {

        int sum = 0;
        int first = 1;
        int second = 1;
        int limit = 4000000;

        while (first < limit) {
            first = first + second;
            second = first - second;
            if (first % 2 == 0)
                sum += first;
        }
        System.out.println(sum);
    }
}
