import java .util.*;
public class RecursionFactorial{
    public static void main(String swe[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.print(fact(s));
    }
    public static int fact(int n){
        if(n==0 || n==1) return 1;
        else return n*fact(n-1);
    }
}
