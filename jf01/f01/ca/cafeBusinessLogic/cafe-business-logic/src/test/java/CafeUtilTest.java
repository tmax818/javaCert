import org.junit.Test;

import co.tylermaxwell.CafeUtil;

import static org.junit.Assert.assertEquals;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;


public class CafeUtilTest {

    CafeUtil cu = new CafeUtil();

    @Test
    public void getStreakGoalTest(){
        assertEquals(55, cu.getStreakGoal());
    }

    @Test
    public void getStreakGoalTestNinja(){
        assertEquals(66, cu.getStreakGoal(11));
    }

    @Test
    public void getOrderTotalTest(){
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        assertEquals(13.5, cu.getOrderTotal(lineItems), 0.02);

    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
   
    }

    @Test
    public void out() {
        System.out.print("hello");
        assertEquals("hello", outContent.toString());
    }

    @Test
    public void displayMenuTest(){
            ArrayList<String> menu = new ArrayList<String>();
            menu.add("drip coffee");
            menu.add("cappuccino");
            menu.add("latte");
            menu.add("mocha");

            cu.displayMenu(menu);
            String messageOut = "0 drip coffee\n1 cappuccino\n2 latte\n3 mocha\n";

            assertEquals(messageOut, outContent.toString());
     
    }


}
