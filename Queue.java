
class QueueDef{
    int front=0;
    int rear=-1;
    int n;
    int arr[];
    public QueueDef(int n){
        this.n=n;
        arr=new int[n];
    }
    public void enqueue(int data){
        if(rear != n-1){
            arr[++rear]=data;
            
        }
        else{
            System.out.println("Queue is full");
        }
    }
    public void dequeue(){
        if(front<=rear){
           System.out.println("popped element "+ arr[front]);
           front++;
           if(front > rear){ 
            front = 0;
            rear = -1;
        }
        
        }
        else{
            System.out.println("Queue is Empty");
        }

    }
    public void display(){
    int temp=front;
        while(temp<=rear){
            System.out.print(arr[temp]+" ");
            temp++;
        }
    }
}


public class Queue {
    public static void main(String[] args) {
        QueueDef q=new QueueDef(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
    
    }
}