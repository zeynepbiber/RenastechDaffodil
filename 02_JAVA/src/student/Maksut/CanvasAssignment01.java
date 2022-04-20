package student.Maksut;

public class CanvasAssignment01 {
    public static void main(String[] args) {
        String sentence = "I like java and javascript,java is best, java and javascript,java ";
        //String sentence2 = "I like java and javascript,java is best, java and javascript,java java javascript java java jav javasc ";
        countAWordInGivenString("java", "javascript", sentence);
    }

    public static void countAWordInGivenString(String wordToCount1, String wordToCount2, String givenString) {
        String[] arrayOfWords = givenString.replace(",", " ").split(" ");
        //System.out.println(Arrays.toString(arrayOfWords));
        int countFor1 = 0;
        int countFor3 = 0;
        int countFor2 = 0;
        int countFor4 = 0;
        for (String arrayOfWord : arrayOfWords) {
            if (arrayOfWord.contains(wordToCount1) && !arrayOfWord.equals(wordToCount2)) {
                countFor1++;
            }
            if (arrayOfWord.equals(wordToCount1) && !arrayOfWord.equals(wordToCount2)) {
                countFor3++;
            }
            if (arrayOfWord.contains(wordToCount2) && !arrayOfWord.equals(wordToCount1)) {
                countFor2++;
            }
            if (arrayOfWord.equals(wordToCount2) && !arrayOfWord.equals(wordToCount1)) {
                countFor4++;
            }
        }
        if (countFor1 != countFor3) {
            System.out.println("This string contains " + countFor1 + " \"" + wordToCount1 + "\".");
            System.out.println("This string has " + countFor3 + " \"" + wordToCount1 + "\". (Exactly equal word without any prefix/suffix.)");
        } else {
            System.out.println("This string contains " + countFor1 + " \"" + wordToCount1 + "\".");
        }

        if (countFor2 != countFor4) {
            System.out.println("This string contains " + countFor2 + " \"" + wordToCount2 + "\".");
            System.out.println("This string has " + countFor4 + " \"" + wordToCount2 + "\". (Exactly equal word without any prefix/suffix.)");
        } else {
            System.out.println("This string contains " + countFor2 + " \"" + wordToCount2 + "\".");
        }
    }
}