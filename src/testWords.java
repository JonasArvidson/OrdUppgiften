import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class testWords {

    @Test       //Testar hur antalet tecken i ordet.

    public void testGetCharacters() {

        //Arrange
        String charWord = "Hejsan";
        theWordsEngine myChars = new theWordsEngine();

        //Act
        myChars.setCharCounter("Hejsan");
        int actual = myChars.getCharCounter();


        //Assert
        int expected = 6;
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test       //Testar om ordet "stop" blir 'false' och stoppar loopen.

    public void testSetFalseStop() {

        //Arrange
        theWordsEngine myChars = new theWordsEngine();

        //Act
        boolean actual = myChars.setStop("stop");


        //Assert
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test       //Testar om ordet "hej" blir 'true' får loopen att fortsätta.

    public void testSetTrueStop() {

        //Arrange
        theWordsEngine myChars = new theWordsEngine();

        //Act
        boolean actual = myChars.setStop("hej");


        //Assert
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test       //Testar längsta ordet.

    public void testTheLongestWord() {

        //Arrange
        theWordsEngine myChars = new theWordsEngine();

        //Act
        myChars.setCharCounter("Hej på dig din gamle galosch");
        String actual = myChars.getLongestWord();


        //Assert
        String expected = "galosch";
        assertEquals(expected, actual);
        System.out.println(actual);
    }
}