package ua.huryn.dsl;

import java.io.*;

/**
 * Created by ahuryn on 05.02.2018.
 */
public class ConvertDSL {

    public static void main(String[] argc) {
        BufferedReader br = null;
        int countOfLines = 0;
        try {
             br = new BufferedReader(new InputStreamReader(
                     new FileInputStream("d:\\Temp\\20180204\\En-En_Cambridge Advanced Learners Dictionary.dsl"),"UTF8"));
             String line;
             StringBuffer sb = new StringBuffer("");
             int i = 0;
             while ((line = br.readLine()) != null && i < 1000) {
                 System.out.println(line);
                 Word wordClass = new Word(line);
                 String word = wordClass.getWord();
                 System.out.println(word);
                 if (word != null) {
                     countOfLines++;
                 }
                 i++;
             }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Count lines of file " + countOfLines);
    }
}
