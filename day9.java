 

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
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(data);
        temp.next=newNode;
        newNode.next=null;

    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
    }
   public static void main(String[] args) {
        day9 list=new day9();
        list.addToFirst(5);
        list.addToLast(10);
        list.addToLast(15);
        list.display();
    
   } 
}
