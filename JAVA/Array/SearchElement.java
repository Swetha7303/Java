import java.util.*;
class SearchElement
{
  public static void main(String[] args)
  {
    int ind,size,ele;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0;ind<size;ind++)
      arr[ind]=sc.nextInt();
    ele = sc.nextInt();
    for(int=0;int<size;int++){
    if(arr[ind]==ele)
    break;
    }
    if
      System.out.print("Found");
    else
      System.out.print("Not found");
  }
}