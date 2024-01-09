import java.util.Scanner;
public class _2DArray {
    public static void main(String[] args) {
        int m,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter no. of rows");
        n=s.nextInt();
        System.out.println("enter no. of column");
        m=s.nextInt();
        int a[][]=new int[n][m];
        System.out.println("enter values :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=s.nextInt();

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            System.out.print(a[i][j]);
                
            }
            System.out.println();
        }
        

    }
}
