import java.util.Scanner;
public class insertArray {
    public static void main(String[] args) {
        int n,m,p;
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of element");
        n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n+1];
        System.out.println("enter values");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter index of new value to be inserted");
        m=s.nextInt();
        System.out.println("enter new  values to be inserted");
        p=s.nextInt();
        for(int i=0;i<n+1;i++)
        {
            if(i<m)
        {
            b[i]=a[i];
        }
        else if(i==m)
            b[i]=p;
        else
        {
            b[i]=a[i-1];
        }
    }
    System.out.print("elements are:- ");
    for(int i=0;i<n+1;i++)
    {
        System.out.println(b[i]);
    }

    }
    
}
