import java.util.*;
class SecondLargestElement
{
  public static void main(String[] args)
  {
    int ind,size;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0; ind<size; ind++){
      arr[ind]=sc.nextInt();
  }
  long lar=Long.MIN_VALUE;
  long seclar=Long.MIN_VALUE;
  for(ind=0;ind<size;ind++){
    int num=arr[ind];
    if(num>lar){
      seclar=lar;
      lar=num;
    }
      else if(num>seclar && num!=lar){
    seclar=num;
  }
  }
    System.out.println(seclar);
  }
}