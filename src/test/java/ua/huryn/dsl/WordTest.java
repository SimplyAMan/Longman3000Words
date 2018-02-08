package ua.huryn.dsl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ahuryn on 07.02.2018.
 */
public class WordTest {
    @Test
    public void SimpleWord() {
        Word word = new Word("about");
        assertEquals("about",word.getWord());
    }
    @Test
    public void NotWordBeginsWithSpace() {
        Word word = new Word(" about");
        assertEquals(null,word.getWord());
    }
    @Test
    public void NotWordBeginsWithTab() {
        Word word = new Word("\tabout");
        assertEquals(null,word.getWord());
    }
    @Test
    public void WordWithDash() {
        Word word = new Word("-enabled");
        assertEquals("-enabled",word.getWord());
    }
    @Test
    public void WordWithOnlyDigit() {
        Word word = new Word("404");
        assertEquals("404",word.getWord());
    }
    @Test
    public void WordWithNumberSpaceAndCharacters() {
        Word word = new Word("800 number");
        assertEquals("800 number",word.getWord());
    }
    @Test
    public void WordNumberDashSpaceAndCharacters() {
        Word word = new Word("18–30 holidays");
        assertEquals("18–30 holidays",word.getWord());
    }
    @Test
    public void WordWithSlash() {
        Word word = new Word("9/11");
        assertEquals("9/11",word.getWord());
    }
    @Test
    public void WordBeginWithDash() {
        Word word = new Word(" - a b l y ");
        assertEquals(" - a b l y ",word.getWord());
    }
    @Test
    public void WordWithParenthesiss() {
        Word word = new Word(" ( a )   s t i c k   t o   b e a t   s o m e b o d y   w i t h ");
        assertEquals(" ( a )   s t i c k   t o   b e a t   s o m e b o d y   w i t h ",word.getWord());
    }
}