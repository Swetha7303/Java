import java.util.Scanner;
class LeftToRightEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        scanner.close();
        String numberStr = Long.toString(number);

        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            if (digit % 2 == 0) {
                System.out.println(digit + "-Even");
            } else {
                System.out.println(digit + "-Odd");
            }
        }
    }
}