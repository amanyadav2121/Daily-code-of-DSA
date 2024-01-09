import java.util.Scanner;
public class maxMinInArray {
    public static void main (String[] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of element");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            
    }
    int max=a[0];
    int min=a[0];
    for(i=1;i<n;i++){
        if(max<a[i])
        max=a[i];
        if(min>a[i])
        min=a[i];
    }
    System.out.println("maximum=" + max);
    System.out.println("minimum=" + min);
    
}
}
