package linkedlistproblems;
public class LinkedListDS {
    static class Node{
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
    public void findNode(int data, int nextData){
        Node newNode = new Node(nextData);
        int cnt = 1;
        Node tmp = head;
        while(tmp != null){
            if(tmp.data == data){
                System.out.println("The Searched Value "+data+" is at position "+cnt);
                newNode.next = tmp.next;
                tmp.next = newNode;
                break;
            }
                tmp = tmp.next;
                cnt++;
            }
    }
    void delNode(int data) {
        Node tmp = head, preData = null;
        if (tmp != null && tmp.data == data) {
            head = tmp.next;
            return;
        }
        while (tmp != null && tmp.data != data) {
            preData = tmp;
            tmp = tmp.next;
        }
        if (tmp == null)
            return;
        preData.next = tmp.next;
    }
    public int size(){
        int len=0;
        Node current = head;
        while (current!= null){
            current = current.next;
            len++;
        }
        return len;
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
        list.findNode(30,40);
        System.out.println("\nList after adding element is :");
        list.getDisplay();
        System.out.println("\nNew List after deleting element is: ");
        list.delNode(40);
        list.getDisplay();
        System.out.println("\nSize after removing element is: "+list.size());
    }
}
