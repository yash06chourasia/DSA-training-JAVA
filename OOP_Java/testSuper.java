class Parent {
    public void whoIAm() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    public void whoIAm() {
        System.out.println("Child class");
    }

    public void whoIsMyParent() {
        super.whoIAm();
    }
}

// Super keyword is used in subclassses to call the methods of parent classes 

public class testSuper {
    public static void main(String[] args) {
        Child s = new Child();
        s.whoIAm();
               
        s.whoIsMyParent(); 
    }
}
