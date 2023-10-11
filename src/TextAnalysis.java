//Matriculation: 7219292
//Bekzod Nazarov
public class TextAnalysis {
    public static void main(String[] args) {
        String soliloquy = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        int spaceCount = 0, vowelCount = 0, letterCount = 0;

        for (char ch : soliloquy.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
                ch = Character.toLowerCase(ch);
                if ("aeiou".indexOf(ch) != -1) {
                    vowelCount++;
                }
            } else if (ch == ' ') {
                spaceCount++;
            }
        }

        System.out.println("The text contained vowels: " + vowelCount + "\n"
                + "consonants: " + (letterCount - vowelCount) + "\n" + "spaces: " + spaceCount);
    }
}
