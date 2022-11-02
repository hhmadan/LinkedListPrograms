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
    public int findNode(int data){
        int cnt = 1;
        Node tmp = head;
        while(tmp != null){
            if(tmp.data == data){
                System.out.println("The Searched Value "+data+" is at position "+cnt);
                return cnt;
            } else{
                tmp = tmp.next;
                cnt++;
            }
        }
        return 0;
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
        list.addNode(30);
        list.addNode(70);
        list.getDisplay();
        System.out.println("\nSearching Value... ");
        list.findNode(30);
    }
}
