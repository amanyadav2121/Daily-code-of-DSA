import java.util.Scanner;
public class printAnElementOfArray {
    public static void main(String[] args){
        int n,i,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of element");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            x=a[i];
            System.out.println(x);
        }
        
}
}