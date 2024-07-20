import java.util.*;
class SpiralMatrix
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int[][] arr =new int[row][col];
        int i,j;
        for(i=0;i<row;i+=1)
        {
            for(j=0;j<col;j+=1)
                arr[i][j]=obj.nextInt();
        }
        int left=0,right=col-1,up=0,down=row-1;
        while(left<=right && up<=down)
        {
            for(i=left;i<=right;i+=1)
                System.out.print(arr[up][i]+" ");
            up++;
            for(i=up;i<=down;i+=1)
                System.out.print(arr[i][right]+" ");
            right--;
            if(up<=down) {
                for (i = right; i >= left; i--) {
                    System.out.print(arr[down][i] + " ");
                }

                down--;
            }
            if(left<=right) {
                for (i = down; i >= up; i--) {
                    System.out.print(arr[i][left] + " ");
                }

                left++;
            }
        }
    }
}