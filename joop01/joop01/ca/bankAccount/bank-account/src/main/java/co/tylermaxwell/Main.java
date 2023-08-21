package co.tylermaxwell;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        String acctNum = "";
        int i = 0;
        while(acctNum.length() < 10){
            if(Character.isDigit(uuid.charAt(i))) acctNum += uuid.charAt(i);
            System.out.println(uuid.charAt(i));
            i++;
        }

        System.out.println(acctNum);
        
 
    }
}
