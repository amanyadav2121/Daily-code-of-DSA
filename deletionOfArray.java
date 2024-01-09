import java.util.Scanner;
public class deletionOfArray {
    public static void main(String[] args) {
        int n,m;
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of element");
        n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n-1];
        System.out.println("enter values");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter index value to be deleted");
        m=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i<m)
        {
            b[i]=a[i];
        }
        else if(i==m)
            continue;
        else
        {
            b[i-1]=a[i];
        }
    }
    System.out.print("elements are:");
    for(int i=0;i<n-1;i++)
    {
        System.out.println(b[i]);
    }

    }
    
}
