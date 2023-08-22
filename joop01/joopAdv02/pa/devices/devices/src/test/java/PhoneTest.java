import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.tylermaxwell.Phone;

public class PhoneTest {

    
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Phone phone;

    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void makeCallTest(){
        phone = new Phone();
        phone.makeCall();
        assertEquals("This should be the message...", 95, phone.getBattery(), 0);
    }
    
    @Test
    public void playGameTest(){
        phone = new Phone();
        phone.playGame();
        assertEquals("This should be the message...", 80, phone.getBattery(), 0);
    }
    
    @Test 
    public void chargeTest(){
        phone = new Phone();
        phone.charge();
        assertEquals("This should be the message...", 150, phone.getBattery(), 0);
    }

    
}
