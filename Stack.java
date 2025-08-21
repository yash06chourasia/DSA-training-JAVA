
class StackDef{
    int top=-1;
    int n;
    int arr[];
    public StackDef(int n){
        this.n=n;
        arr=new int[n];
    }
    public void push(int data){
        if(top!=n-1){
            arr[++top]=data;
        }
        else{
            System.out.println("Stack is full");
        }
    }
    public void pop(){
        if(top!=-1){
           System.out.println("popped element "+ arr[top]);
           top--;
        
        }
        else{
            System.out.println("Stack is Empty");
        }

    }
    public void display(){
    int temp=top;
        while(temp!=-1){
            System.out.print(arr[temp]+" ");
            temp--;
        }
    }
}


public class Stack {
    public static void main(String[] args) {
        StackDef stk=new StackDef(5);
        stk.push(5);
        stk.push(4);
        stk.push(3);
        stk.push(2);
        stk.pop();
        stk.display();

    }
}