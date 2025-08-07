class Add {
   
   public int Addition(int a ,int b){
    return a+b;
   }
   public String Addition( String a , String b){
    return a+b;
   }
   public int Addition( int a,int b,int c){
    return a+b+c;
   }
}

public class methodOverloading {
    public static void main(String[] args) {
      Add a1=new Add();
      Add b1=new Add();
      Add c1=new Add();
      System.out.println(a1.Addition("Yash", "Chourasia"));
      System.out.println(b1.Addition(1,5, 4));
      System.out.println( c1.Addition(5, 4));
    }
}