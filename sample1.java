import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sample1 {

    public static void main(String[] args) {
        File inputFile = new File("note1.txt");
        Scanner myObj;
        int count =0,count1=0,count2=0,count3=0;

        try {
            myObj = new Scanner(inputFile);

            FileWriter outputFileWriter = new FileWriter("note2.txt");

            while (myObj.hasNextLine()) {
                String data = myObj.nextLine();
                System.out.println(data);
                if(data=="\0"){
                    count++;
                }else if(data=="\n"){
                     count1++;
                }else if (data=="\t"){
                     count2++;
                }else{
                 count3++;
                }
                
                
                outputFileWriter.write(data + "\n"); // Write each line to the output file
            }System.out.println("the charcters "+count+"the space"+count2+"the line"+count1);

            myObj.close();
            outputFileWriter.close(); // Close the FileWriter

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
