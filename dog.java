public class dog extends Animals {
    private String race;
    private double weight;
    private boolean cute;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isCute() {
        return cute;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }
   

    @Override
    public String toString() {
        super.dog();
        return "the dog's" + " race is " + race + " , it's weight is " + weight+" pounds " + ", it's also cute: " + cute;
    }
    
    
}
