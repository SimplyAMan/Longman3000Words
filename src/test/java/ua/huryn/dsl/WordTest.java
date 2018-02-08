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
        Word word = new Word("-ably");
        assertEquals("-ably",word.getWord());
    }
    @Test
    public void WordWithParenthesiss() {
        Word word = new Word("(a) stick to beat somebody with");
        assertEquals("(a) stick to beat somebody with",word.getWord());
    }
    @Test
    public void StartWordWithDollar() {
        Word word = new Word("$64,000 question, the");
        assertEquals("$64,000 question, the",word.getWord());
    }
    @Test
    public void NotStartWithSharp() {
        Word word = new Word("#NAME \"Longman DOCE 5th Ed. (En-En)\"");
        assertEquals(null,word.getWord());
    }
}