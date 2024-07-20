import java.util.*;
class SmallestElement
{
  public static void main(String[] args)
  {
    int ind,size,min=1000000;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0; ind<size; ind++){
      arr[ind]=sc.nextInt();
  }
  for(ind=0;ind<size;ind++){
    if(min>arr[ind])
    min = arr[ind];
  }
    System.out.print(min);
  }
}