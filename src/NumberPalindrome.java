public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

        // If negative, change it into positive
        if (number < 0) {
            number *= -1;
        }

        int originalNumber = number;
        int reverseNumber = 0;
        int counter = 0;

        // Determine how many digits
        while (number > 0) {
            number /= 10;
            counter++;
        }
        System.out.println("Number of digits = " + counter);

        number = originalNumber;
        System.out.println("original number = " + number);

//        // Create reverse number
//        for (int i = 0; i < counter; i++) {
//            int lastDigit = number % 10;
//            reverseNumber = reverseNumber * 10 + lastDigit;
//            number /= 10;
//        }
//        System.out.println("reverse number = " + reverseNumber);


        // Create reverse number
        for (int i = 0; i < counter; i++) {
            int power = counter - (i + 1);
            reverseNumber = reverseNumber + (number % 10) * ((int) Math.pow(10, power));
            number /= 10;
        }
        System.out.println("reverse number = " + reverseNumber);

        if (originalNumber == reverseNumber) {
            return true;
        }
        return false;
    }
}
