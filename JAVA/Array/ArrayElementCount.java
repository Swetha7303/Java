import java.util.*;
class ArrayElementCount
{
  public static void main(String[] args)
  {
    int ind,size,c1=0,c2=0;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0;ind<size;ind++)
    {
      arr[ind] = sc.nextInt();
    }
    for(ind=0;ind<size;ind++){
      if(arr[ind]==1)
      c1=c1+1;
      else c2=c2+1;
    }
    System.out.println("zc = "+c2);
    System.out.println("oc = "+c1);
  }
}