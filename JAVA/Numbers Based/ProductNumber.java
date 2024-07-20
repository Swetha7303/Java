import java.util.*;
public class ProductNumber{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    long a=n.nextLong();
    long b=1,c;
    while(a!=0)
    {
      c=a%10;
      b=b*c;
      a=a/10;
    }
    System.out.print(b);
  }
}