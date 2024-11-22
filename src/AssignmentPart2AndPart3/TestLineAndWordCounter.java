package AssignmentPart2AndPart3;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestLineAndWordCounter {
    @Test
    public void testLineCountOne() {
        LineAndWordCounter lineAndWordCounter = new LineAndWordCounter(0, 0, 0, "");
        lineAndWordCounter.addLine("Hi");
        int expected = 1;
        int actual = lineAndWordCounter.getTotalLines();
        assertEquals(expected, actual);
    }

    @Test
    public void testLineCountTwo() {
        LineAndWordCounter lineAndWordCounter = new LineAndWordCounter(0, 0, 0, "");
        lineAndWordCounter.addLine("Hello");
        lineAndWordCounter.addLine("how are you");
        int expectedLine = 2;
        int actualLine = lineAndWordCounter.getTotalLines();
        assertEquals(expectedLine, actualLine);
    }

    @Test
    public void testCharCount() {
        LineAndWordCounter lineAndWordCounter = new LineAndWordCounter(0, 0, 0, "");
        lineAndWordCounter.addLine("Hello");
        lineAndWordCounter.addLine("how are you");
        int expected = 16;
        int actual = lineAndWordCounter.getTotalCharacters();
        assertEquals(expected, actual);

    }

    @Test
    public void testLineCountEmpty() {
        LineAndWordCounter lineAndWordCounter = new LineAndWordCounter(0, 0, 0, "");
        lineAndWordCounter.addLine("    ");
        int expectedLine = 1;
        int actualLine = lineAndWordCounter.getTotalLines();
        assertEquals(expectedLine, actualLine);
    }

    @Test
    public void testCharCountForEmptyLine() {
        LineAndWordCounter lineAndWordCounter = new LineAndWordCounter(0, 0, 0, "");
        lineAndWordCounter.addLine("    ");
        int expectedChar = 4;
        int actualChar = lineAndWordCounter.getTotalCharacters();
        assertEquals(expectedChar, actualChar);
    }

    @Test
    public void testDetectStop() {
        LineAndWordCounter lineAndWordCounter = new LineAndWordCounter(0, 0, 0, "");
        String line = "stop";
        boolean expected = true;
        boolean actual = lineAndWordCounter.isStopDetect(line);
        assertEquals(expected, actual);
    }

    @Test
    public void testWordCount() {
        LineAndWordCounter lineAndWordCounter = new LineAndWordCounter(0, 0, 0, "");
        lineAndWordCounter.wordCountAndFindLongestWord("Hello");
        lineAndWordCounter.wordCountAndFindLongestWord("how are you");
        int expected = 4;
        int actual = lineAndWordCounter.getTotalWords();
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestWord() {
        LineAndWordCounter lineAndWordCounter = new LineAndWordCounter(0, 0, 0, "");
        lineAndWordCounter.wordCountAndFindLongestWord("Hello");
        lineAndWordCounter.wordCountAndFindLongestWord("how are you");
        String expected = "Hello";
        String actual = lineAndWordCounter.getLongestWord();
        assertEquals(expected, actual);
    }
}


