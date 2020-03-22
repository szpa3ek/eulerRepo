public class PrimeFactor {
    private static int dividend = 2;

    public static void main(String[] args) {

        findMaxPrimeFactor(600851475143L);
    }

    private static void findMaxPrimeFactor(long number) {

        while (number != 1) {
            if (number % dividend != 0) {
                dividend++;
            } else {
                int maxPrimeFactor = (int) number;
                number = number / dividend;
                if (number == 1) {
                    System.out.println(maxPrimeFactor);
                }
            }
        }
    }
}
