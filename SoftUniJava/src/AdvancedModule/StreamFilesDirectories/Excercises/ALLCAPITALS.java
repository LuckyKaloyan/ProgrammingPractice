package AdvancedModule.StreamFilesDirectories.Excercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        BufferedReader kiufte = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Resource\\input.txt"));
        String bytes = kiufte.readLine();
        while(bytes!=null){
            System.out.println(bytes.toUpperCase());

            bytes = kiufte.readLine();
        }




    }
}