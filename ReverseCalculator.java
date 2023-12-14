public class ReverseCalculator {
    public static void main(String[] args) {
        int number = 27;

        // Reverse using while loop
        int reversedNumberWhile = reverseUsingWhileLoop(number);
        System.out.println("The reverse of the number using while is: " + reversedNumberWhile);

        // Reverse using for loop
        int reversedNumberFor = reverseUsingForLoop(number);
        System.out.println("The reverse of the number using for is: " + reversedNumberFor);

        // Reverse using do-while loop
        int reversedNumberDoWhile = reverseUsingDoWhileLoop(number);
        System.out.println("The reverse of the number using do - while is: " + reversedNumberDoWhile);
    }

    // Method to reverse number using while loop
    public static int reverseUsingWhileLoop(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    // Method to reverse number using for loop
    public static int reverseUsingForLoop(int number) {
        int reversed = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    // Method to reverse number using do-while loop
    public static int reverseUsingDoWhileLoop(int number) {
        int reversed = 0;
        do {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        } while (number != 0);
        return reversed;
    }
}
