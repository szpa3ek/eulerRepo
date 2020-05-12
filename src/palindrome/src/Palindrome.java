package palindrome.src;

public class Palindrome {
    public static void main(String[] args) {
        int max = 0;
        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = 999; i > 100; i--) {
            for (int j = i; j > 100; j--) {
                int multiplication = i * j;
                if (isPalindrome(multiplication)) {
                    if ((i + j) > max) {
                        max = i + j;
                        firstNumber = i;
                        secondNumber = j;
                    }
                }
            }
        }
        System.out.println("first number: " + firstNumber + " second number: " + secondNumber);
        System.out.println(firstNumber * secondNumber);
    }

    private static boolean isPalindrome(int number) {
        String p = Integer.toString(number);
        StringBuilder s = new StringBuilder(Integer.toString(number));
        s.reverse();
        return p.equals(s.toString());
    }
}
