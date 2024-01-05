package TestingTrash;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TESTTEST {
    public static void main(String[] args) {

        try{
            FileInputStream inputStream = new FileInputStream("C:\\Users\\LuckyK\\Desktop\\Directory\\Neverx500.txt");
            Scanner scanner = new Scanner(inputStream);
            int oneByte = inputStream.read();
            while(oneByte>=0){
                System.out.print(oneByte+" ");
                oneByte = inputStream.read();
            }

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println();
            System.out.println("cake");
        }


    }
}
