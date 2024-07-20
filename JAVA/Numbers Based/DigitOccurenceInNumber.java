import java.util.*;
public class DigitOccurenceInNumber{
  public static void main(String swe[]){
    Scanner s=new Scanner(System.in);
    long a=s.nextInt();
    long b=s.nextInt();
    long c=0,d;
    while(a!=0){
      d=a%10;
      if(d==b){
      c=c+1;}
      a=a/10;
    }
    System.out.print(c);
  }
}