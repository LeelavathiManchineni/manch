package AssignmentPart2AndPart3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LineAndWordCounter lineAndWordCounter = new LineAndWordCounter(0, 0, 0, "");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        /* while (true) {  // running infinite loop for reading the lines from the user
            line = scanner.nextLine();

            if (lineAndWordCounter.isStopDetect(line)) {
                break;
            }
            lineAndWordCounter.addLine(line);
            lineAndWordCounter.wordCountAndFindLongestWord(line);
        }*/


        while (!lineAndWordCounter.isStopDetect(line)) {
            lineAndWordCounter.addLine(line);
            lineAndWordCounter.wordCountAndFindLongestWord(line);
            line = scanner.nextLine();
        }
        //get the no of lines
        int totalLines = lineAndWordCounter.getTotalLines();
        //get the no of characters
        int totalCharacters = lineAndWordCounter.getTotalCharacters();
        //get the no of words
        int totalWords = lineAndWordCounter.getTotalWords();
        //get the longest word
        String longestWord = lineAndWordCounter.getLongestWord();
        // printing results
        System.out.println("Number of lines: " + totalLines);
        System.out.println("Number of characters: " + totalCharacters);
        System.out.println("Number of words: " + totalWords);
        System.out.println("Longest word is : " + longestWord);
    }
}

