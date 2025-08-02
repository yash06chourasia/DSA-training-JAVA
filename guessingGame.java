import java.util.Scanner;

public class guessingGame {
    int random;
    guessingGame(){
        this.random=(int)Math.ceil(Math.random()*100);
    }
    /**
     * 
     * @param guess the number user guessed
     * @return 
     * - 0 if matchs
     * - negative if guess is smaller
     * - positive if guess is greater
     */
    int guessedNum(int guess){
        return guess-random; 
    }
    public static void main(String[] args) {
        guessingGame rGame=new guessingGame();
        System.out.println("Enter the number to guess between 1-100");
        Scanner inp=new Scanner(System.in);
        int guess;
        int res;
        do{
            guess=inp.nextInt();
            res=rGame.guessedNum(guess);
            if(res==0){
               System.out.println("Congrats you guessed right");
            }else if(res>0){
                System.out.println("Think of smaller number");
            }else{
                System.out.println("Think a larger number");
            }
        }while(res!=0);
    }
}
