import org.example.PangramChecker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PangramCheckerTest {
    @Test
    @DisplayName("checks for empty input")
    void isInputEmpty(){
        PangramChecker pangramChecker = new PangramChecker();
        boolean expected = pangramChecker.check("");
        boolean actual = false;
        assertEquals(expected,actual,"should fail");
    }
}
