import java.util.*;
class SumOfRightSideElement
{
  
  public static void main(String[] args)
  {
    int ind,size,sum=0;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0;ind<size;ind++)
    {
      arr[ind]=sc.nextInt();
      sum+=arr[ind];
    }
    
    for(ind=0;ind<size;ind++){
      arr[ind] =sum-arr[ind];
      sum=arr[ind];
      
    }
    for(ind=0;ind<size;ind++)
      {System.out.print(arr[ind]+" ");}
      
    
  }
}