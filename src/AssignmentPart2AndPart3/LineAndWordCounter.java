package AssignmentPart2AndPart3;

public class LineAndWordCounter {
    private int totalLines = 0;
    private int totalCharacters = 0;
    private int totalWords = 0;
    private String longestWord = " "; // Initializing longestWord as 0 length

    public void wordCountAndFindLongestWord(String line) {
        String[] myStringArray = line.split("\\s");
        totalWords += myStringArray.length;
        //System.out.println("Total words count is:" + totalWords);

        for (int i = 0; i < myStringArray.length; i++) {
            //System.out.println(myStringArray[i]);
            // Finding the longestWord in myStringArray
            if (longestWord.length() < myStringArray[i].length()) {
                longestWord = myStringArray[i];
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
        if (line.contains("stop")) {
            return true;
        } else
            return false;
    }
}
