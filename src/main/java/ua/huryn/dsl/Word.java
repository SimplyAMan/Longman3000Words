package ua.huryn.dsl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ahuryn on 07.02.2018.
 */
public class Word {
    private String word;

    public Word(String row) {
        Pattern pattern = Pattern.compile("^[^\\t\\s#].+$");
        //"^[^\\t][\\w\\–\\s\\/\\-\\)\\(]+$"
        Matcher matcher = pattern.matcher(row);
        if (matcher.find())
            this.word = matcher.group();
    }
    public String getWord () {
        return word;
    }
}
