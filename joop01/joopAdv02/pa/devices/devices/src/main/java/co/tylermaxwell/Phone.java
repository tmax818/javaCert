package co.tylermaxwell;

public class Phone extends Device{




    public void makeCall(){
        this.setBattery(getBattery() - 5);
        System.out.printf("something");
    }

    public void playGame(){
        this.setBattery(getBattery() - 20);
    }

    public void charge(){
        this.setBattery(getBattery() + 50);
    }
    
}
