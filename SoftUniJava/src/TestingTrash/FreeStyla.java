package TestingTrash;

import java.io.FileInputStream;
import java.io.IOException;

public class FreeStyla {
    public static void main(String[] args) throws IOException {


        FileInputStream kiufte = new FileInputStream("input.txt");
        int kebabchi = kiufte.read();


        while(kebabchi!=-1){

            System.out.print(Integer.toBinaryString(kebabchi)+" ");
            kebabchi=kiufte.read();
        }
    }
}
