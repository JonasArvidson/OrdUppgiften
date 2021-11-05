public class theWordsEngine {

    private int rowCounter;
    private int charCounter;

    //KONSTRUKTOR
    public theWordsEngine() {
    }

    //GET
    public int getCharCounter() {
        return charCounter;
    }
    public int getRowCounter() {
        return rowCounter;
    }

    //SET
    public void setRowCounter() {
        rowCounter++;
    }
    public void setCharCounter(String aWord) {

        charCounter += aWord.length();
    }

    //Om ordet är stop, stanna loopen
    public boolean setStop(String aWord) {
        if (aWord.equals("stop")) {
            return false;
        }
        return true;
    }
}