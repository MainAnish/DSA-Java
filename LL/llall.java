import java.util.Scanner;

public class llall {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void addFirst(int data){
        Node ll=new Node(data);

        ll.next=head;
        head=ll;
    }
    public void addLast(int data){
        Node ll=new Node(data);
        if(head==null){
            head=ll;
            return;
        }
        Node current=head;
        while(current.next != null){
            current=current.next;
        }
        current.next=ll;
    }
    public void addPosi(int data,int posi){
        Node ll=new Node(data);
        if(head==null){
            if(posi==0){
            head=ll;
            }
            else{
                System.out.println("Position out of Range");
            }
            return;
        }
        if(posi<0){
            System.out.println("Invalid Position");
            return;
        }
        if(posi==0){
            ll.next=head;
            head=ll;
            return;
        }
        Node current=head;
        for(int i=0;i<posi-1;i++){
            if(current==null){
                System.out.println("Position out of range");
            }
            current=current.next;
        }
        if(current==null){
            System.out.println("Position out of range");
            return;
        }
        ll.next=current.next;
        current.next=ll;   
    }
    public void deletePosi(int posi){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if (posi<0){
            System.out.println("Invalid Position");
            return;
        }
        if(posi==0){
            head=head.next;
            return;
        }
        Node current=head;
        for(int i=0;i<posi-1;i++){
            if(current==null){
                System.out.println("Position out of range");
                return;
            }
            current=current.next;
        }
            if(current==null || current.next == null){
            System.out.println("Position out of range");
            return;
            }
        current.next=current.next.next;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node current=head;

        while(current.next.next != null){
            current=current.next;
        }
        current.next=null;
    }
    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current=head;

        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public void search(int data){
        Node current=head;
        int posi=0;
        while(current != null){
            if(current.data==data){
                System.out.println("Element found at position"+posi);
                return;
            }
        current  =  current.next;
        posi++;
        }
        System.out.println("Element not found");
    }
    public int size() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
    public void get(int posi) {

        if (posi < 0) {
            System.out.println("Invalid position");
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null) {

            if (count == posi) {
                System.out.println("Value: " + current.data);
                return;
            }

            current = current.next;
            count++;
        }

        System.out.println("Position out of range");
    }
    public void update(int posi, int data) {

        if (posi < 0) {
            System.out.println("Invalid position");
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null) {

            if (count == posi) {
                current.data = data;
                System.out.println("Value updated");
                return;
            }

            current = current.next;
            count++;
        }

        System.out.println("Position out of range");
    }
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    llall list = new llall();

    while (true) {

        System.out.println("\n===== LINKED LIST =====");
        System.out.println("1. Add First");
        System.out.println("2. Add Last");
        System.out.println("3. Add at Position");
        System.out.println("4. Delete First");
        System.out.println("5. Delete Last");
        System.out.println("6. Delete at Position");
        System.out.println("7. Display");
        System.out.println("8. Search");
        System.out.println("9. Size");
        System.out.println("10. Get Value");
        System.out.println("11. Update Value");
        System.out.println("12. Exit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter data: ");
                int data1 = sc.nextInt();
                list.addFirst(data1);
                break;

            case 2:
                System.out.print("Enter data: ");
                int data2 = sc.nextInt();
                list.addLast(data2);
                break;

            case 3:
                System.out.print("Enter data: ");
                int data3 = sc.nextInt();

                System.out.print("Enter position: ");
                int pos = sc.nextInt();

                list.addPosi(data3, pos);
                break;

            case 4:
                list.deleteFirst();
                break;

            case 5:
                list.deleteLast();
                break;

            case 6:
                System.out.print("Enter position: ");
                int deletePos = sc.nextInt();

                list.deletePosi(deletePos);
                break;

            case 7:
                list.display();
                break;

            case 8:
                System.out.print("Enter data to search: ");
                int searchData = sc.nextInt();

                list.search(searchData);
                break;

            case 9:
                System.out.println("Size: " + list.size());
                break;

            case 10:
                System.out.print("Enter position: ");
                int getPos = sc.nextInt();

                list.get(getPos);
                break;

            case 11:
                System.out.print("Enter position: ");
                int updatePos = sc.nextInt();

                System.out.print("Enter new data: ");
                int newData = sc.nextInt();

                list.update(updatePos, newData);
                break;

            case 12:
                System.out.println("Program ended.");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice!");
        }
    }
} 
}
