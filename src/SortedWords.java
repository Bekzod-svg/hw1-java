//Matriculation: 7219292
//Bekzod Nazarov
public class SortedWords {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        String[] extractedWords = text.split("[\\W]+");

        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < extractedWords.length - 1; i++) {
                if (extractedWords[i].compareToIgnoreCase(extractedWords[i + 1]) > 0) {
                    String tempWord = extractedWords[i];
                    extractedWords[i] = extractedWords[i + 1];
                    extractedWords[i + 1] = tempWord;
                    flag = true;
                }
            }
        } while (flag);

        for (String word : extractedWords) {
            System.out.println(word);
        }
    }
}
