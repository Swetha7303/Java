import java.util.*;
class SumOfArray
{
  public static void main(String[] args)
  {
    int ind,size,sum=0;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0;ind<size;ind++)
    {
      arr[ind] = sc.nextInt();
    }
    for(ind=0;ind<size;ind++){
      sum +=arr[ind];
    }
    System.out.println(sum);
  }
}