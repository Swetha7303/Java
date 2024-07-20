import java.util.*;
public class UpperCaseString{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    String s=n.nextLine();
    int co=0,i;
    for(i=0;i<s.length();i++){
      if(Character.isUpperCase(s.charAt(i)))
      co +=1;
    }
    System.out.print(co);
  }
}