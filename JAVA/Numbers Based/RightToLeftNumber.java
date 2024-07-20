import java.util.*;
class RightToLeftNumber{
public static void main(String args[]){
  Scanner n=new Scanner(System.in);
  long num=n.nextInt();
  long a;
  while(num!=0)
  {
    a=num%10;
    num/=10;
    System.out.print(a+" ");
  }
    
  }
}