import java.util.Scanner;
class OddProductDivideByEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        scanner.close();
        if (isDivisible(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isDivisible(long number) {
        String numStr = Long.toString(number);
        int evenProduct = 1;
        int oddSum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            int value = Character.getNumericValue(digit);
            
            if (i % 2 == 0) {
                evenProduct *= value;
            } else {
                oddSum += value;
            }
        }
        return evenProduct % oddSum == 0;
    }
}