class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class circularLinkList {
    Node head;
    Node tail;
    public void addToFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
            return;
        }
        newNode.next=head;
        head=newNode;
        tail.next=head;

    }

    public void display(){
        Node temp=head;
        if (head == null) {
        System.out.println("List is empty");
        return;
        }
        do{
            System.out.print(temp.data +" -> ");
            temp=temp.next;
        }while(temp!=head);

    }

    public void addToLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
            return;
        }
        newNode.next=head;
        tail.next=newNode;
        tail=newNode;
    }

    public void addToPos(int data,int index){
        Node newNode=new Node(data);
        if(index==0){
            if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else{
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }
        return;
        }
        int i=0;
        Node temp=head;
        while(i<index-1){
            temp=temp.next;
            i++;
            if (temp == head) {
            System.out.println("Index out of bounds");
             return;
            }
        }
        newNode.next=temp.next;
        temp.next=newNode;
        

    }
    public void deleteFirst(){

        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        head=head.next;
        tail.next=head;
    }
    public static void main(String[] args) {
        circularLinkList list=new circularLinkList();
        // list.addToFirst(20);
        // list.addToFirst(15);
        // list.addToFirst(10);
        // list.addToFirst(5);
        list.addToLast(25);
        list.addToLast(30);
        list.addToPos(27,1);
        list.addToPos(28,2);
        list.addToPos(26,1);
        list.deleteFirst();
        list.display();
    }
}