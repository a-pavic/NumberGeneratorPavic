package pavic.fh;
//imports aus Projekt MaintananceMon. übernommen
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerateRandomNumbers_Test {
    @Test
    public void randomNumber_Test(){
        //Arrange
        GenerateRandomNumbers rn = new GenerateRandomNumbers();
        //Act
        int result = rn.randomNumber();
        //Assert
        Assertions.assertEquals(true, result <= 600 && result >= 500);
    }

    @Test
    public void randomNumberStellen_Test(){
        //Arrange
        GenerateRandomNumbers rn = new GenerateRandomNumbers();
        String stellen = "111";
        int length = stellen.length();
        //Act
        int result = rn.randomNumber();
        String tmp = Integer.toString(result);
        int resultstel = tmp.length();

        //Assert
        Assertions.assertEquals(length, resultstel);
    }



}
