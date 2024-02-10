public class cat extends Animals {
    private boolean whiskers;
    private int numberOfCats;

    public boolean isWhiskers() {
        return whiskers;
    }

    public void setWhiskers(boolean whiskers) {
        this.whiskers = whiskers;
    }

    public int getNumberOfCats() {
        return numberOfCats;
    }

    public void setNumberOfCats(int numberOfCats) {
        this.numberOfCats = numberOfCats;
    }
    

    @Override
    public String toString() {
        super.cat();
        return "This cat has " + "whiskers: " + whiskers + " ,you have " + numberOfCats + " cats";
    }
    
    
}
