package AssignmentPart2AndPart3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LineAndWordCounter lineAndWordCounter = new LineAndWordCounter();
        String line;
        int i = 0;
        while (i < 5) {  // running infinite loop for reading the lines from the user
            line = scanner.nextLine();
            //if (line.contains("stop")) {
            if (lineAndWordCounter.isStopDetect(line) == true) {
                break;
            }
            lineAndWordCounter.addLine(line);
            lineAndWordCounter.wordCountAndFindLongestWord(line);
        }
        // printing results
        int totalLines = lineAndWordCounter.getTotalLines();
        int totalCharacters = lineAndWordCounter.getTotalCharacters();
        int totalWords = lineAndWordCounter.getTotalWords();
        String longestWord = lineAndWordCounter.getLongestWord();
        System.out.println("Number of lines: " + totalLines);
        System.out.println("Number of characters: " + totalCharacters);
        System.out.println("Number of words: " + totalWords);
        System.out.println("Longest word is : " + longestWord);
    }
}
