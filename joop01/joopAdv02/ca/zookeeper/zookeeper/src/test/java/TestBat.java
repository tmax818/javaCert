import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.tylermaxwell.Bat;

public class TestBat {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Bat bat;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    

    @Test
    public void batEnergyTest(){
        bat = new Bat();
        assertEquals(300, bat.getEnergy());
    }

    @Test
    public void flyTest(){}

    @Test
    public void eatHumansTest(){}

    @Test
    public void attackTownTest(){
        
    }






    @Test
    public void batDisplayEnergyTest(){
        bat = new Bat();
        bat.getEnergy();
        assertEquals("The Bat's energy is 300\n", outContent.toString());

    }
}
