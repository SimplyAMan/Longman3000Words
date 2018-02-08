package ua.huryn.dsl;

import java.io.*;

/**
 * Created by ahuryn on 05.02.2018.
 */
public class Longman3000Words {

    public static void main(String[] argc) {
        int countOfLines = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("d:\\Temp\\20180204\\test.dsl"))) {
            String line;
            while ((line = br.readLine()) != null) {
                Word wordClass = new Word(line);
                String word = wordClass.getWord();
                if (word != null) {
                    countOfLines ++;
                    //System.out.println(word);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Count lines of file " + countOfLines);
    }
}
