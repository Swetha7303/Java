import java.util.*;
public class VowelsToSpace{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    String s=n.nextLine();
    for(char ch:s.toCharArray()){
      if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    System.out.print(" "); 
    else System.out.print(ch);}
      
    }
}