package problemSeven.src;

public class ProblemSeven {

    public static void main(String[] args) {
        int position = 10001;
        int counter = 1;
        int primeNum = 0;

        primeNum = getPrimeNumber(position, counter, primeNum);
        System.out.println("10001st prime number is: " + primeNum);
    }

    private static int getPrimeNumber(int position, int counter, int primeNum) {
        for (int i = 2; counter <= position; i++) {
            if (isPrime(i)) {
                counter++;
                primeNum = i;
            }
        }
        return primeNum;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

