public class theWordsEngine {

    private int rowCounter;
    private int charCounter;
    private int wordCounter;
    private String longestWord;

    //KONSTRUKTOR
    public theWordsEngine() {
        this.longestWord = "";
    }

    //GET
    public int getCharCounter() {
        return charCounter;
    }
    public int getRowCounter() {
        return rowCounter;
    }
    public int getWordCounter() {
        return wordCounter;
    }
    public String getLongestWord() {
        return longestWord;
    }

    //SET
    public void setRowCounter() {
        rowCounter++;
    }
    public void setCharCounter(String aWord) {
            String[] splitWords = aWord.split(" ");
            for (String word : splitWords) {
                charCounter += word.length();
                wordCounter++;
                if (longestWord.length() < word.length()) {
                    longestWord = word;
                    if (word.equals("stop")) {
                        setStop(word);
                    }
                }
            }
    }
    //Om ordet är stop, stanna loopen
    public boolean setStop(String aWord) {
        if (aWord.equals("stop")) {
            return false;
        }
        return true;
    }
}