public class Frequency_count {
    public static void main(String[] args) {
        String str="Yash Chourasia";
        String done="";
       
         for(char i=0;i<str.length();i++){
            int count=1;
            char ch=str.charAt(i);
            if(done.indexOf(ch)==-1){
                    done+=ch;
                for(int j=i+1;j<str.length();j++){

                    if(str.charAt(i)==str.charAt(j)){
                        count+=1;
                    }
                }
                System.out.println(str.charAt(i)+" occurs "+count+" times");
            }
         
        }
    }
    
}
