import java.util.*;
public class CharacterFound{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    String s1=n.nextLine();
    char c=n.next().charAt(0);
    int count=0;
    int t;
    for(char ch:s1.toCharArray()){
      count ++;
    }
    t=count;
    count=0;
    for(char ch:s1.toCharArray()){
      count++;
      if(ch==c)
      break;
    }
    if(t>count)
    System.out.print("Found");
    else System.out.print("Not Found");
  }
} 