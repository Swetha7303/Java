import java.util.*;
class ToMakeAPerfectSquare{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    long num=sc.nextLong();
    System.out.print(minimum(num));}
    
    public static long minimum(long n){
      if(n==0) return 1;
      long div=1;
      long temp=n;
      for(long i=2;i*i<=n;i++){
       int co=0;
       while(temp%i==0){ temp /=i;
       co++;}
       if(co%2!=0){
       div *=i;
    }
      }
      if(temp>1)
      div *=temp;
      return div;
    }
}