class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Build{
    Node build(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(root.data>val){
            root.left=build(root.left,val);
        }
        else{
            root.right=build(root.right,val);
        }
        return root;
    }
    void search(Node root,int val){
        if(root==null){
            System.out.println("Empty tree");
        }
        if(root.data==val){
            System.out.println("Element found");
        }
        if(val<root.data){
            search(root.left,val);
        }
        if(val>root.data){
            search(root.right,val);
        }
    }
}

public class bst {
    public static void main(String[] args) {
        int arr[]={5,1,24,4,6,46,78,9};
        Build list=new Build();
        Node root=null;
        for(int val :arr){
            root=list.build(root, val);
        }
        list.search(root, 4);
    }
    
}
