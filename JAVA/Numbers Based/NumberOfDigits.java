import java.util.*;
class NumberOfDigits{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    long a=n.nextInt();
    long c=0;
    while(a!=0){
      c++;
      a=a/10;
    }
    System.out.print(c);
  }
}