import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

    public static void main(String[] args) {
        String fileName="example.txt";

        // try with resource :- syntax try(){}
        // it is basically used to handle the resources and ensures that no resource is leaked and closed after use


        try(FileWriter writer=new FileWriter(fileName)){
            writer.write("This is an example file content\n");
            for (int index = 0; index < 10; index++) {
               writer.write(Integer.toString(index)+"\n");
                
            }
            writer.flush();
            System.out.println("Successfully written on the file");
        }catch(IOException e){
            System.out.println("Error has occured");
        }
    }
}