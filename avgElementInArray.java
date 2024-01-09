import java.util.Scanner;
public class avgElementInArray {
    public static void main(String[] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of element");
        n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum=sum+ a[i];
        }
            double avg = sum / n;
        System.out.println("average" + avg);
        
    }
    
}
