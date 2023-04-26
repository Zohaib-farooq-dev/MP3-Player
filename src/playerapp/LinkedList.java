package playerapp;

public class LinkedList {
    Node head;
    Node tail;
    int n;
    
    public void add( int index, String str,String str2){
        Node newNode = new Node(index,str,str2);
        if(head == null){
            head = newNode;
            n++;
        } else{
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            n++;
        }
        tail= newNode;
    }
    
    public Node  get( int index){
        Node ptr = head;
        do{
            if(ptr.index == index){
                return ptr;
            }
            ptr = ptr.next;
        }while(ptr!=head);
        return head;
    }
    
    
}
