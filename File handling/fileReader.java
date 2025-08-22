import java.io.FileReader;
import java.io.IOException;

public class fileReader {

    public static void main(String[] args) {
        String fileName="example.txt";

        // try with resource :- syntax try(){}
        // it is basically used to handle the resources and ensures that no resource is leaked and closed after use


        try(FileReader reader=new FileReader(fileName)){
            int read=0;
            do{
                read=reader.read();
                System.out.print((char)read);
            }while(read!=-1);
        }catch(IOException e){
            System.out.println("Error has occured");
        }
    }
}