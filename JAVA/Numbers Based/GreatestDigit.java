import java.util.*;
class GreatestDigit{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    long a=s.nextLong();
    long max=0;
    long b;
    while(a!=0){
      b=a%10;
      if(max<b){
      max=b;
      }
      a=a/10;
    }
    System.out.print(max);
  }
}