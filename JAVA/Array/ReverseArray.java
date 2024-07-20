import java.util.*;
class ReverseArray
{
  public static void main(String[] args)
  {
    int ind,size;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0;ind<size;ind++)
    {
      arr[ind] = sc.nextInt();
    }
  for(ind=size-1;ind>=0;ind--){
    System.out.print(arr[ind]+" ");
  }
  }
}