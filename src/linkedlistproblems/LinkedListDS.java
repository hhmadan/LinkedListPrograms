package linkedlistproblems;
public class LinkedListDS {
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addNode(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            Node tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = node;
        }
    }

    public Node addNodeAt(int pos, int data){
        if(pos == 1){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        else{
            while(pos-- !=0){
                if(pos ==1){
                    Node newNode = new Node(data);
                    newNode.next = head.next;
                    head.next = newNode;
                    break;
                }
                head = head.next;
            }
        }
        return head;
    }
    public void getDisplay(){
        Node current = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while (current!= null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedListDS list = new LinkedListDS();
        System.out.println("Initially, linked list is..");
        list.getDisplay();
        System.out.println("\nNodes created in Linked List are: ");
        list.addNode(56);
        list.addNode(70);
        list.getDisplay();
        System.out.println("\nAfter inserting node in between list is: ");
        list.addNodeAt(2,30);
        list.getDisplay();
    }
}
