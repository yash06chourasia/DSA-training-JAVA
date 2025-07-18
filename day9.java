 

 class Node{
    int data;
    Node next;
    // Constructor creation
    public Node(int data){
        this.data=data;
        this.next=null;
    }
 }
 
 class day9 {
    Node head;
    public void addToFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addToLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=newNode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
    }
    void addToIndex(int data,int index){
        Node newNode=new Node(data);
        if(index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1 && temp!=null;i++){
            temp=temp.next;
        }
        if (temp == null) {
        System.out.println("Invalid index");
        return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void deleteFirst(){
       head=head.next;
    }

     public void deleteLast(){
       Node temp=head;
        if (head == null) {
        return;
        }
        if (head.next == null) {
        head = null;
        return;
        }
       while(temp.next.next!=null){
        temp=temp.next;
       }
       temp.next=null;
    }
    public void deleteAtPosition(int index){
    if (head == null) {
        return;
    }
    if (index == 0) {
        head = head.next;
        return;
    }
    Node temp = head;
    int i = 0;
    while (i < index - 1) {
        if (temp == null || temp.next == null) {
            return;
        }
        temp = temp.next;
        i++;
    }
    if (temp.next == null) {
        return;
    }

    temp.next = temp.next.next;

    }
    
   public static void main(String[] args) {
        day9 list=new day9();
        list.addToFirst(5);
        list.addToLast(10);
        list.addToLast(15);
        list.addToFirst(1);
        list.addToIndex(8,0);
        list.deleteFirst();
        list.deleteLast();
        list.addToLast(20);
        list.deleteAtPosition(1);
        list.display();

    
   } 
}
