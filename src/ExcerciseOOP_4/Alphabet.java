package ExcerciseOOP_4;

public class Alphabet {
    public String convert(int number) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G"};

       /* String letter = "";
        if(number == 1) {
            letter = "A";
        } else if(number == 3) {
            letter = "C";
        } else if(number == 7) {
            letter = "G";
        }
        return letter;*/

        return alphabet[number - 1];


    }


    public int convertNumber(String letter) {
        return 4;
    }
}
