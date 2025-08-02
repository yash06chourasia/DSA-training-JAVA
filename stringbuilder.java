public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello Yash ,");
        str.append(" You are learning Java");
        // Stringbuilder is not thread safe but provide mutablility to string
        System.out.println(str);
    }
}
