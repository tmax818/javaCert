import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.tylermaxwell.BankAccount;

public class BankAccountTest {

    private BankAccount acct;

    
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

    @Before
    public void createAccount(){
        acct = new BankAccount();
  

    }


    @Test
    public void numberOfAccountsTest(){
        assertEquals(1, BankAccount.getAccounts());
    }

    
    @Test
    public void depositTest(){
        BankAccount acct = new BankAccount();
        acct.deposit(1000, "chokcing");
        double balance = acct.getCheckingBalance();
        assertEquals(1000.0, balance, 0.01);
        
    }
    
    @Test
    public void withdrawTest(){
        BankAccount acct = new BankAccount();
        acct.deposit(1000, "");
        assertEquals(1000, acct.getSavingsBalance(), 0);
    }
    
    @Test 
    public void depositSavingsTest(){
        BankAccount acct = new BankAccount();
        acct.deposit(1000, "s");
        double balance = acct.getSavingsBalance();
        assertEquals(1000, balance, 0);
    }
    
    @Test
    public void getBalanceTest(){
        BankAccount acct = new BankAccount();
        acct.getBalance();
        assertEquals("Your balance is: $0.00\n", outContent.toString());
        acct.deposit(1000, "ch");
        acct.getBalance();
        assertEquals("Your balance is: $0.00\nYour balance is: $1000.00\n", outContent.toString());
    }
    
    @Test
    public void totalMoneyTest(){
        acct.deposit(21000, "");
        assertEquals( 21000, BankAccount.getTotalMoney(), 0.01);
    }
}
