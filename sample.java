import java.io.FileWriter;
import java.io.IOException;


public class sample {
    public static void main(String[] args) {
        
    
    try{
    try (FileWriter myobj = new FileWriter("note1.txt")) {
        myobj.write("hello tjis is fun coding is just amazin in my life i can live without coding");
         myobj.close();
    System.out.println("the file is successfully created");
    }


    }
    catch(IOException e){
        e.printStackTrace();
        System.out.println("exceptioncoocured");
    }
}
}