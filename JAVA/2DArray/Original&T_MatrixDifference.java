import java.util.*;
class Original&T_MatrixDifference{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    int i,j,dif=0;
    for(i=0;i<r;i++){
      for(j=0;j<c;j++) arr[i][j]=sc.nextInt();
    }
    if(r!=c) System.out.print("Subtraction cannot be performed for rectangular matrix");
    else {
      for(i=0;i<r;System.out.println(),i++){
    for(j=0;j<c;j++){
      dif =arr[i][j]-arr[j][i];
      System.out.print(dif+" ");}
      dif=0;
  }
}
}
}