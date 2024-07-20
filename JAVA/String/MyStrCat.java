import java.util.*;
public class MyStrCat{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    String st1=n.nextLine();
    String st2=n.nextLine();
    System.out.print(mystrcat(st1,st2));
  }
  public static String mystrcat(String s,String s1){
    return s1.concat(s);
  }
}