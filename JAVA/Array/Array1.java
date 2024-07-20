import java.util.*;
class Array1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    int ind;
    for(ind=0;ind<size;ind++)
    {
      arr[ind] = sc.nextInt();
    }
    for(ind=0;ind<size;ind++){
      System.out.print(arr[ind]+" ");
    }
  }
}