import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.tylermaxwell.Gorilla;
import co.tylermaxwell.Mammal;

public class TestGorilla {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Gorilla gorilla;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    

    @Test
    public void displayEnergyTest(){
        gorilla = new Gorilla();
        gorilla.getEnergy();
        assertEquals("The Gorilla's energy is 100", outContent.toString());
    }
    
    @Test
    public void inheritanceTest(){
        Gorilla gorilla = new Gorilla();
        assertTrue(gorilla instanceof Mammal);
        
    }
    
    @Test
    public void throwSomethingTest(){
        Gorilla gorilla = new Gorilla();
        gorilla.throwSomething();
        assertEquals(95, gorilla.getEnergy());
    }

    @Test
    public void throwSomethingMessageTest(){
        Gorilla gorilla = new Gorilla();
        gorilla.throwSomething();
        assertEquals("The Gorilla's energy is 100The gorilla threw something!!", outContent.toString());
    }
}
