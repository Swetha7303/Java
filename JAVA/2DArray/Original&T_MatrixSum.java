import java.util.*;
class Original&T_MatrixSum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    int i,j,sum=0;
    for(i=0;i<r;i++){
      for(j=0;j<c;j++) arr[i][j]=sc.nextInt();
    }
    if(r!=c) System.out.print("Sum cannot be performed for rectangular matrix");
    else{
      for(i=0;i<r;System.out.println(),i++){
         for(j=0;j<c;j++){
           sum=arr[i][j]+arr[j][i];
           System.out.print(sum+" ");} sum=0;
    }
  }
}
}