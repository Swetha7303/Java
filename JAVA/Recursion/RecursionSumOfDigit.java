import java .util.*;
public class RecursionSumOfDigit {
    public static void main(String swe[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.print(sum(s));
    }
    public static int sum(int n){
        n=n%10;
        if(n==0) return 0;
        else return n+sum(n-1);
    }
}
