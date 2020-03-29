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

    private static boolean isDivisibleByAll(long n) {
        boolean isDivisible = true;
        if (n % 7 != 0 || n % 11 != 0 || n % 13 != 0 || n % 15 != 0 || n % 16 != 0 || n % 17 != 0 || n % 18 != 0 || n % 19 != 0) {
            isDivisible = false;
        }
        return isDivisible;
    }
}
