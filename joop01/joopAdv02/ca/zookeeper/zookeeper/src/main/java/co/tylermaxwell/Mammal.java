package co.tylermaxwell;


public class Mammal {

    
    private int energy;

    public Mammal(){
        this.energy = 100;
    }

    public Mammal(int energy){
        this.energy = energy;
    }


    public int getEnergy() {
        System.out.printf("The %s's energy is %d\n", this.getClass().getSimpleName(), this.energy);
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }



}
