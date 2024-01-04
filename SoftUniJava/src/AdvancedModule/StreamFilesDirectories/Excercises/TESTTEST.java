package AdvancedModule.StreamFilesDirectories.Excercises;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TESTTEST {
    public static void main(String[] args) {

        try{
            FileInputStream inputStream = new FileInputStream("C:\\Users\\LuckyK\\Desktop\\Directory\\Neverx500.txt");
            Scanner scanner = new Scanner(inputStream);
            String str = scanner.nextLine();
            System.out.println(str);

        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }


    }
}
