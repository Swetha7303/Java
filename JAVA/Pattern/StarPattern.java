import java.util.*;
class StarPattern{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int r,s1,sp,s2;
    for(r=1;r<=n;System.out.println(),r+=1){
      for(s1=1;s1<=r;s1++){
        System.out.print("*");
      }
      for(sp=1;sp<=2*(n-r);sp++)
      System.out.print(" ");
      for(s2=1;s2<=r;s2++)
      System.out.print("*");
    }
    for(r=n;r>=1;System.out.println(),r--){
      for(s1=1;s1<=r;s1++)
      System.out.print("*");
      for(sp=1;sp<=2*(n-r);sp++)
      System.out.print(" ");
      for(s2=1;s2<=r;s2++)
      System.out.print("*");
    }
    
  }
}