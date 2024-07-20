import java.util.*;
class PrimeDigit{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    long a=n.nextLong();
    long b=1,i;
    long t=a;
    while(t>=10){
      b *=10;
      t /=10;
    }
    
    while(a!=0){
      b=a/10;
      for(i=2;i*i<b;i++){
    if(b%i==0) 
    break;}
    if(i*i>b ){
      if(b!=1)
    System.out.print(b+" ");}
    a %=b;
    b /=10;
    }
  }
}