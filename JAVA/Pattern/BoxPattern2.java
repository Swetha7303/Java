import java.util.Scanner;
public class BoxPattern2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int row = 1; row <= num; row++, System.out.println()) {
            for(int col = 1; col <= num; col++) {
                if (row==1||row==num||col==1||col==num)
                    System.out.print("1");
             
                else
                    System.out.print("0");
            }
        }
    }
}
