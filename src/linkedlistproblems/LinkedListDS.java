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
    public void sortNodes(){
        Node current = head, index;
        int temp;
        while (current != null)
        {
            index = current.next;
            while (index != null) {
                    if (current.data > index.data)
                    {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
            }
                current = current.next;
        }
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
        System.out.println("\nInitially, linked list is..");
        list.getDisplay();
        System.out.println("\nNodes created in Linked List are: ");
        list.addNode(56);
        list.addNode(30);
        list.addNode(40);
        list.addNode(70);
        list.getDisplay();
        System.out.println("\nAFTER SORTING ...");
        list.sortNodes();
        list.getDisplay();
    }
}
