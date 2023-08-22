package co.tylermaxwell;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.getBattery());
        phone.makeCall();
    }
}