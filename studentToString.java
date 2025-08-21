class studentToString {
   int age;
   String name;
   int rollno;
   String house;

   studentToString(int age ,String name,int roll,String house){
    this.age=age;
    this.name=name;
    this.rollno=roll;
    this.house=house;
   }

   @Override
   public String toString() {
    //    TODO Auto-generated method stub
    //    return super.toString();
    return "Student data :{age "+this.age+",name "+this.name+",roll "+this.rollno+",house "+this.house+"}";
   }
   
   
   public static void main(String[] args) {
    studentToString stud1=new studentToString(10,"Yash",39,"Yellow");
    System.out.println(stud1);
   }
}
