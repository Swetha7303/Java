import java.util.Scanner;

class MultiplicationWithTransposeMatrix
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int row= obj.nextInt();
        int col= obj.nextInt();
        int[][] arr=new int[row][col];
        int[][] trans=new int[col][row];
        int i,j;
        for(i=0;i<row;i+=1)
        {
            for(j=0;j<col;j+=1)
                arr[i][j]=obj.nextInt();
        }
        //creating transpose matrix
       int row1=col,col1=row;
        for(i=0;i<row1;i+=1) {
            for (j = 0; j < col1; j += 1)
               trans[i][j]=arr[j][i];
        }
        for(i=0;i<row1; System.out.println() ,i+=1) {
            for (j = 0; j < col1; j += 1)
                System.out.printf("%d ",trans[i][j]);
        }
        int[][] multi=new int[row][col1];
        int k;
        for(i=0;i<row;i+=1)
        {
            for(j=0;j<col1;j+=1)
            {
                  for(k=0;k<col;k+=1)
                      multi[i][j]+=arr[i][k]*trans[k][j];
            }
        }
       for(i=0;i<row; System.out.println() ,i+=1) {
            for (j = 0; j < col1; j += 1)
                System.out.printf("%d ",multi[i][j]);
        }
    }
}