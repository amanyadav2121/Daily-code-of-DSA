package link_list;
import java.util.Scanner;
public class s_linklist_Code1 {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    Node head=null;
    public void creation()
    {
        int data,n;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("enter data");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null)
            {
                head=new_node;
            }
            else{
                new_node.next=head;
                head=new_node;
            }
            System.out.println("do you want to add more data,if yes..press:1");
            n=sc.nextInt();
        }
        while(n==1);
    }
    public void traverser()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println(" ll dosen't exists");
        }
        else{
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        s_linklist_Code1  ll=new s_linklist_Code1 ();
        ll.creation();
        ll.traverser();
    }

    
}
