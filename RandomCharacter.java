package wk09_Lab;

import java.util.Random;

public class RandomCharacter {
    /** Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** get one random lower case character between ‘a’ and ‘z */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /** get one random upper case letter between ‘A’ and ‘Z’ */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /** get one random digit number between ‘0’ and ‘9’ */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /** get one random character */
    public static char getRandomCharacter() {
        Random r = new Random();
        return (char) (r.nextInt(95) + 32);
    }

    /** get one random prime digit number */
    public static int getRandomPrimeDigit() {
        int num = 0;
        Random rand = new Random(); // generate a random number
        num = rand.nextInt(1000) + 1;

        while (!isPrime(num)) {
            num = rand.nextInt(1000) + 1;
        }
        return num;
    }

    public static boolean isPrime(int inputNum) {
        if (inputNum <= 3 || inputNum % 2 == 0)
            return inputNum == 2 || inputNum == 3; // this returns false if number is <=1 & true if number = 2 or 3
        int divisor = 3;
        while ((divisor <= Math.sqrt(inputNum)) && (inputNum % divisor != 0))
            divisor += 2; // iterates through all possible divisors
        return inputNum % divisor != 0; // returns True/False
    }

    public static void main(String args[]) {
        final int NUMBER_OF_CHARS = 15;
        char ch;
        int ch2;
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            /** get one random lower case character between ‘a’ and ‘z */
            ch = RandomCharacter.getRandomLowerCaseLetter();
            System.out.print(ch);
        }
        System.out.println();
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            /** get one random upper case letter between ‘A’ and ‘Z’ */
            ch = RandomCharacter.getRandomUpperCaseLetter();
            System.out.print(ch);
        }
        System.out.println();
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            /** get one random digit number between ‘0’ and ‘9’ */
            ch = RandomCharacter.getRandomDigitCharacter();
            System.out.print(ch);
        }
        System.out.println();
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            /** get one random character */
            ch = RandomCharacter.getRandomCharacter();
            System.out.print(ch);
        }
        System.out.println();
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            /** get one random prime digit number */
            ch2 = RandomCharacter.getRandomPrimeDigit();
            System.out.print(ch2);
        }
    }
}
