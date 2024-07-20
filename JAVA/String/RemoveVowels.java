import java.util.*;
class RemoveVowels{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String s1=s.nextLine();
    for(char ch:s1.toCharArray())
    {
      if(ch != 'a' && ch !='e'&& ch!='i' && ch !='o' && ch!='u' && ch!='A' && ch !='E' && ch !='I' && ch !='O' && ch !='U'){
      System.out.print(ch);}
    }
  }
}