import java.util.Scanner;

public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
    
    public static LinkedList insertAtFirst(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = list.head;
        list.head = new_node;
        return list;
    }

    public static LinkedList insertAtLast(LinkedList list,int data){
        Node new_node=new Node(data);
        if(list.head == null){
            list.head=new_node;
        }
        else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }
    public static LinkedList insertAtPosition(LinkedList list,int data,int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = list.head;
            list.head=newNode;
            return list;
        }
        Node temp = list.head;
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp!=null){
            newNode.next=temp.next;
            temp.next=newNode;
        }
        return list;
    }
    public static void printList(LinkedList list){
        Node currNode=list.head;
        System.out.println("Linked List:");
        while(currNode != null){
            System.out.println(currNode.data+"");
            currNode=currNode.next;
        }
    }
    public static LinkedList deleteFirst(LinkedList list){
        if(list.head != null){
            list.head = list.head.next;
        }
        return list;
    }
    public static LinkedList deleteLast(LinkedList list){
        if(list.head == null){
            return list;
        }
        if(list.head.next == null){
            list.head = null;
            return list;
        }
        Node temp = list.head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return list;
    }
    public static LinkedList deleteAtPosition(LinkedList list,int pos){
        if(pos < 1 || list.head == null){
            return list;
        }
        if(pos == 1){
            list.head = list.head.next;
            return list;
        }
        Node temp = list.head;
        for (int i = 1; i < pos - 1 && temp != null; i++){
            temp = temp.next;
        }
        if (temp != null && temp.next != null){
            temp.next = temp.next.next;
        }
    return list;
    }
    public static void search(LinkedList list,int key){
        Node t=list.head;
        while(t!=null){
            if(t.data==key){
                System.out.println("Found");
                break;
            }
            t=t.next;
        }
    }
    public static void count(LinkedList list){
        int count = 0;
        Node t = list.head;
        while (t != null){
            count++;
            t=t.next;
        }
        System.out.println(count);
    }
    
    public static LinkedList reverse(LinkedList list) {
        Node prev = null, curr = list.head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        list.head = prev;
        return list;
    }
    public static LinkedList middLinkedList(LinkedList list){
        Node slow = list.head,fast = list.head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow != null){
            System.out.println(slow.data);
        }
        return list;
    }
    public static void findNthNode(LinkedList list, int n){
        int pos = 1;
        Node t = list.head;

        while (t!= null && pos <n){
            t=t.next;
            pos++;
        }
        if(n>0 && t!= null){
            System.out.println(t.data);
        }
        else
        {
            System.out.println("Invalid Position");
        }
    }

    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, data, pos;

        do {
            System.out.println("\n--- Linked List Operations ---");
            System.out.println("1. Insert at First");
            System.out.println("2. Insert at Last");
            System.out.println("3. Insert at Any Position");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete at Position");
            System.out.println("7. Search");
            System.out.println("8. Middle Node");
            System.out.println("9. Count Nodes");
            System.out.println("10. Reverse Linked List");
            System.out.println("11. Find Nth Node");
            System.out.println("12. Print Linked List");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
               case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list = insertAtFirst(list, data);
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list = insertAtLast(list, data);
                    break;

                case 3:
                    System.out.print("Enter data and position: ");
                    data = sc.nextInt();
                    pos = sc.nextInt();
                    if (pos < 1) {
                        System.out.println("Invalid position");
                        break;
                    }
                    list = insertAtPosition(list, data, pos);
                    break;

                case 4:
                    list = deleteFirst(list);
                    break;

                case 5:
                    list = deleteLast(list);
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    list = deleteAtPosition(list, pos);
                    break;

                case 7:
                    System.out.print("Enter element to search: ");
                    data = sc.nextInt();
                    search(list, data);
                    break;

                case 8:
                    middLinkedList(list);
                    break;

                case 9:
                    count(list);
                    break;

                case 10:
                    list = reverse(list);
                    System.out.println("List reversed.");
                    break;

                case 11:
                    System.out.print("Enter N: ");
                    pos = sc.nextInt();
                        findNthNode(list, pos);
                        break;

                    case 12:
                    printList(list);
                        break;

                    case 0:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 0);

        sc.close();
    }
}
