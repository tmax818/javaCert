import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.tylermaxwell.Mammal;

public class TestMammal {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Mammal mammal;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    

    @Test
    public void MammalTest(){
        mammal = new Mammal();
        assertEquals(mammal.getEnergy(), 100);
    }

    @Test
    public void displayEnergyTest(){
        mammal = new Mammal();
        mammal.getEnergy();
        assertEquals("The Mammal's energy is 100\n", outContent.toString());
        assertTrue(outContent.toString().contains("The Mammal's energy is 100"));
    }
}
