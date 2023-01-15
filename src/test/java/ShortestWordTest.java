import org.example.ShortestWord;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordTest {
    @Test
    @DisplayName("what is the correct length")
    void correctLength(){
        int actual = ShortestWord.findShort("apple pie is everyone's favorite food");
        int expected = 2;
        assertEquals(expected,actual,"supposed to return the length of the shortest word");
    }
    @Test
    void isEmpty(){
        int expected = ShortestWord.findShort("");
        int actual = 0;
        assertEquals(expected,actual,"no words, no length");
    }
}
