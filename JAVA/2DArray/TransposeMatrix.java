import java.util.*;
class TransposeMatrix{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int arr[][]=new int[r][r];
    int i,j;
    for(i=0;i<r;i++){
      for(j=0;j<r;j++) 
      arr[i][j]=sc.nextInt();
    }
    for(i=0;i<r;System.out.println(),i++){
      for(j=0;j<r;j++) System.out.print(arr[j][i]+" ");
    }
  }
}