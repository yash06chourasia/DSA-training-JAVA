public class diceRoll {
    int roll(){
        double random=Math.random()*6;
        return (int)Math.ceil(random);
    }
    public static void main(String[] args) {
        diceRoll dice=new diceRoll();
        System.out.println("Random value of die thrown 5 times : ");
        for (int index = 0; index < 5; index++) {
            System.out.println(dice.roll());
        }

    }
}
