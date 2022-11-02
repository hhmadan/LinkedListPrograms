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
    public Node popLast(){
        if(head == null){
            return null;
        }
        if(head.next ==  null){
            return null;
        }
        Node secondLast = head;
        while(secondLast.next.next != null){
            secondLast = secondLast.next;
        }
        secondLast.next = null;
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
        list.addNode(30);
        list.addNode(70);
        list.getDisplay();
        System.out.println("\nAfter deleting Last node list is: ");
        list.popLast();
        list.getDisplay();
    }
}

// DELETION OF NODE BY GIVING POSITION
//public class LinkedListDS {
//    class Node{
//        int data;
//        Node next;
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//    public Node head = null;
//    public void addNode(int data){
//        Node node = new Node(data);
//        if(head == null){
//            head = node;
//        }
//        else{
//            Node tmp = head;
//            while(tmp.next!=null){
//                tmp = tmp.next;
//            }
//            tmp.next = node;
//        }
//    }
//    public LinkedListDS pop(LinkedListDS list, int index) {
//        Node current = list.head, prev = null;
//
//        if (index == 0 && current != null) {
//            list.head = current.next;
//            return list;
//        }
//
//        int counter = 0;
//        while (current != null) {
//
//            if (counter == index) {
//                prev.next = current.next;
//                System.out.println(index + " position element deleted");
//                break;
//            } else {
//
//                prev = current;
//                current = current.next;
//                counter++;
//            }
//        }
//        if (current == null) {
//            System.out.println(index + " position element not found");
//        }
//        return list;
//    }
//    public void getDisplay(){
//        Node current = head;
//        if(head == null){
//            System.out.println("List is Empty");
//            return;
//        }
//        while (current!= null){
//            System.out.print(current.data+" ");
//            current = current.next;
//        }
//    }
//    public static void main(String[] args) {
//        LinkedListDS list = new LinkedListDS();
//        System.out.println("Initially, linked list is..");
//        list.getDisplay();
//        System.out.println("\nNodes created in Linked List are: ");
//        list.addNode(56);
//        list.addNode(30);
//        list.addNode(70);
//        list.getDisplay();
//        System.out.println("\nAfter deleting node list is: ");
//        list.pop(list,2);
//        list.getDisplay();
//    }
//}
