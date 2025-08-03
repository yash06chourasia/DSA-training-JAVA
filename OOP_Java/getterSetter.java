public class getterSetter {
        private String name;
        private int age;

        //Getter  read only
        public String getName(){ 
            return name;
        }
        //Setter  write only
        public void setAge(int age){
            this.age=age;
        }



    public static void main(String[] args) {
        getterSetter g=new getterSetter();
        g.setAge(20);
        g.name="Yash";
        System.out.println(g.name + g.age);
    }
}
