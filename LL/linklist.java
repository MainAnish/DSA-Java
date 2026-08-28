public class linklist{
    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }       
    }
    Node head;
    public static void main(String args[]){
        linklist in=new linklist();
        Node n1=in.new Node(10);
        Node n2=in.new Node(20);
        Node n3=in.new Node(30);

        n1.next=n2;
        n2.next=n3;

        in.head=n1;

        Node current=in.head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }

    }
}