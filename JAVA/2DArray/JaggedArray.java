import java.util.*;
public class JaggedArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
//        int r=3;
//        int arr[][]=new int[3][];
//        arr[0]=new int[4];
//        arr[1]=new int[3];
//        arr[2]=new int[5];
        int r=sc.nextInt();
        int c,k;
        int arr[][]=new int[r][];
        for(k=0;k<r;k++){
            c=sc.nextInt();
            arr[k]=new int[c];
        }
        int i,j;
        for(i=0;i<r;i++){
            for(j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;System.out.println(),i++){
            for(j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]+" ");
        }
    }
}
