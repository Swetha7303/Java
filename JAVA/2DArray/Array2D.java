import java.util.*;
class Array2D{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    int i,j;
    for(i=0;i<r;i++){
      for(j=0;j<c;j++)
      arr[i][j]=sc.nextInt();
    }
    for(i=0;i<r;System.out.println(),i++){
      for(j=0;j<c;j++)
    System.out.print(arr[i][j]+" ");
  }
}
}