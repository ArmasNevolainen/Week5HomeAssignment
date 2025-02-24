
public class Dice {
    private int die1;
    private int die2;

    public void roll() {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    public boolean isDouble() {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }
    public int getDie2() {
        return die2;
    }

    public static void main(String[] args){
        Dice dice = new Dice();
        int counter = 0;

        do {
            System.out.println("Rolling the dice ...");
            dice.roll();
            counter++;
            System.out.println("Die 1: " + dice.getDie1());
            System.out.println("Die 2: " + dice.getDie2());
            if (dice.isDouble()){
                System.out.println("You rolled a double!");
                System.out.println("After " + counter + " try both reach the same value.");
            }
            else System.out.println("Try again.");
        } while (!dice.isDouble());
    }
}

