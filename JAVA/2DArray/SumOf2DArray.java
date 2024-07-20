import java.util.*;
class SumOf2DArray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    int i,j,sum=0;
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
      arr[i][j]=sc.nextInt();
      sum+=arr[i][j];}
    }
    System.out.print("Sum of All Elements of the Matrix is "+sum);
    }
}