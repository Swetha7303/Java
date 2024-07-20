import java.util.Scanner;
class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfDigits = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }
        boolean isHarshad = (originalNumber % sumOfDigits) == 0;
        if (isHarshad) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
       
    }
}