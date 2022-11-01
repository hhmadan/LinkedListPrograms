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
    public void adding(int data) {
            Node node = new Node(data);
            if(head == null)
            {
                head = node;
            }
            else
            {
                Node temp = head;
                while(temp.next != null)
                {
                    temp = temp.next;
                }
                temp.next = node;
            }
            System.out.println(node.data+ " is Inserted In The Linked List");
    }
    public void display() {
            Node temp = head;
            if(temp == null)
            {
                System.out.println("LinkedList is Empty\n");
                return;
            }
            while(temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINKED LIST PROGRAMS");
        LinkedListDS list = new LinkedListDS();
        list.display();

        list.adding(56);
        list.adding(30);
        list.adding(70);
        System.out.println();
        list.display();
    }
}
