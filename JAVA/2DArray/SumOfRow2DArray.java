import java.util.*;
class SumOfRow2DArray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    int i,j,sum=0;
    for(i=0;i<r;i++){
      for(j=0;j<c;j++)
      arr[i][j]=sc.nextInt();
    }
    for(i=0;i<r;System.out.println(),i++){
      sum +=arr[i][0];
      for(j=1;j<c;j++){
      sum +=arr[i][j];}
      System.out.print("Sum of the Row "+(i+1)+" is "+sum);
      sum =0;
    }
  }
}