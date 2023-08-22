package co.tylermaxwell;

public class Main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Gorilla gorilla = new Gorilla();
        Bat bat = new Bat();
        System.out.println(mammal.getClass());
        gorilla.getEnergy();
        bat.getEnergy();

    }
}