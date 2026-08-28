public class llauto {
    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    void add(int data){
        Node ll = new Node(data);
        if(head==null){
            head=ll;
            return;
        }
        Node current = head;
        while(current.next != null){
            current=current.next;
        }
        current.next=ll;
    }
    void display(){
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        llauto list=new llauto();

        list.add(11);
        list.add(21);
        list.add(28);

        list.display();

    }

}
