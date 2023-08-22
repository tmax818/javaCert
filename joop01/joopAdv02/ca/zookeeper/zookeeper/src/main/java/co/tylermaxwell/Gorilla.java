package co.tylermaxwell;

public class Gorilla extends Mammal {

    public void throwSomething(){
        int energy = this.getEnergy();
        this.setEnergy(energy -= 5);
        System.out.printf("The gorilla threw something!!");
    }
    
}
