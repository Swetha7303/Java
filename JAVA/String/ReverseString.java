import java.util.*;
class ReverseString{
  public static void main(String args[]){
    Scanner t=new Scanner(System.in);
    String o=t.nextLine();
    char cha[]=o.toCharArray();
    int n=cha.length;
    for(int i=0;i<n/2;i++){
      char temp=cha[i];
      cha[i]=cha[n-1-i];
      cha[n-1-i]=temp;
    }
    String r=new String(cha);
    System.out.print(r);
  }
}