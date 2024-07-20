import java.util.*;
class SparseMatrix{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    int i,j,co=0;
    for(i=0;i<r;i++){
      for(j=0;j<c;j++)
      arr[i][j]=sc.nextInt();
    
    }
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
    if(arr[i][j]==0)
    co+=1;
    }
  }
  if(co>((r*c)/2))
  System.out.print("Sparse Matrix");
  else System.out.print("Not a Sparse Matrix");
}
}