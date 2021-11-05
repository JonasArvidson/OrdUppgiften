import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class testWords {

    @Test

    public void testGetRows() {

        //Arrange
        String charWord = "hej";
        theWordsEngine myRows = new theWordsEngine();

        //Act
        myRows.setRowCounter();
        int actual = myRows.getRowCounter();


        //Assert
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test

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

    @Test       //Testar om ordet "stop" blir 'false' och stoppar loopen

    public void testSetFalseStop() {

        //Arrange
        theWordsEngine myChars = new theWordsEngine();

        //Act
        boolean actual = myChars.setStop("stop");


        //Assert
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test       //Testar om ordet "hej" blir 'true' får loopen att fortsätta

    public void testSetTrueStop() {

        //Arrange
        theWordsEngine myChars = new theWordsEngine();

        //Act
        boolean actual = myChars.setStop("hej");


        //Assert
        boolean expected = true;
        assertEquals(expected, actual);
    }
}