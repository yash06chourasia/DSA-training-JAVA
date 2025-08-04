public class equalsAndHashcode {
    public static void main(String[] args) {
        Person p1=new Person("Yash", 21, "CS29");
        Person p2=new Person("Yash", 21, "CS29"); 
        Person p3=new Person("Yash", 20, "CS29");


        // Reference check  p1and p2 have different reference
        if(p1==p2){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        // Value check of object method equals is overidden in Person Class 
        if(p1.equals(p2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p2.equals(p3));
    }
}
