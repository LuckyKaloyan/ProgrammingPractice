package AdvancedModule.StreamFilesDirectories.Excercises;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader kebab = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\words.txt"));
        String[] listche = kebab.readLine().split(" ");
        
        kebab.close();

        BufferedReader kiufte = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\text.txt"));
        BufferedWriter karnache = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\results.txt"));
        TreeMap<String, Integer> mapche = new TreeMap<>();

        for (String item : listche) {
            mapche.put(item, 0);
        }

        String line = kiufte.readLine();

        while (line != null) {
            String[] skara = line.split(" ");

            for (String value : skara) {
                for (String s : listche) {
                    if (value.contains(s)) {
                        mapche.put(s, mapche.get(s) + 1);
                    }
                }
            }
try {
    line = kiufte.readLine().toLowerCase();
}catch(Exception kek){
    kiufte.close();
}
        }
        kiufte.close();

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : mapche.entrySet()) {
            list.add(entry.getValue() + " " + entry.getKey());
        }

        list.sort(Collections.reverseOrder()); // Sort the list in descending order

        for (String wordCount : list) {
            String[] word = wordCount.split(" ");
            karnache.write((word[1] + " - " + word[0]) + "\n"); // Writing each word count to the file
        }
        karnache.close();
    }
}
