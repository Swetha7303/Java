import java.util.Scanner;
class LargestElement{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int[] arr=new int[a];
      int i,max=-100000;
      for(i=0;i<a;i++){
        arr[i]=sc.nextInt();
    }
    for(i=0;i<a;i++){
      if(max<arr[i])
      max = arr[i];
    }
    System.out.println(max);
  }
}