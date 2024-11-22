package AssignmentPart2AndPart3;

public class LineAndWordCounter {
    private int totalLines;
    private int totalCharacters;
    private int totalWords;
    private String longestWord;

    public LineAndWordCounter( int totalLines, int totalCharacters, int totalWords, String longestWord) {
        this.totalLines = totalLines;
        this.totalCharacters = totalCharacters;
        this.totalWords = totalWords;
        this.longestWord = longestWord;
    }


    public void wordCountAndFindLongestWord(String line) {
        String[] myStringArray = line.split("\\s");
        totalWords += myStringArray.length;

        for (int i = 0; i < myStringArray.length; i++) {
            //System.out.println("words is: " + myStringArray[i]);
            //System.out.println("size of words is: " + myStringArray[i].length());
            // Finding the longestWord in myStringArray
            if (longestWord.length() < myStringArray[i].length()) {
                longestWord = myStringArray[i];
                //System.out.println("long word is : " + longestWord);
            }
        }

    }


    public void addLine(String line) {
        totalLines++;
        totalCharacters += line.length();

    }

    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalCharacters() {
        return totalCharacters;
    }

    public int getTotalWords() {
        return totalWords;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public boolean isStopDetect(String line) {
        if (line.equals("stop")) {
            return true;
        } else
            return false;
    }
}

