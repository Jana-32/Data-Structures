package uno;
public class Player {
     private String name;
    private int numOfCards;

    public Player(String name) {
        this.name = name;
        this.numOfCards = 7;
    }

    public Player(String name, int numOfCards) {
        this.name = name;
        this.numOfCards = numOfCards;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfCards() {
        return numOfCards;
    }

    public void setNumOfCards(int numOfCards) {
        this.numOfCards = numOfCards;
    }

    @Override
    public String toString() {
        return "player{" + "name=" + name + ", numOfCards=" + numOfCards + '}';
    }
    

    
}
