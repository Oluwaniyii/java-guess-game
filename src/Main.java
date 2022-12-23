import java.util.Scanner;

/*  Java Guess Game
    Tempest456
    12/22
*/
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static boolean isFirstGame = true;

    public static void startGame(){
        System.out.println("""
                
                        Rule of this game
                        The computer picks a random number ranging from 1-9
                        You have 3 chances to guess correctly, or you fail
                """);

        int secretNumber = (int) (Math.random() * 9) + 1;
        byte chancesLeft = 3;
        int guessNumber;

        while (true) {
            if(chancesLeft < 1){
                System.out.println("You failed!, secret number is " + secretNumber);
                break;
            }

            chancesLeft--;
            System.out.print("guess > ");
            guessNumber = Main.scanner.nextInt();

            if (guessNumber == secretNumber) {
                System.out.println("Correct!, secret number is " + secretNumber);
                break;
            }
        }
    }


    public static void main(String[] args) {
        while(true){
            String gameAddress = isFirstGame ? "start" : "restart";

            System.out.printf("\nEnter S to %S game, Enter Q to QUIT\n> ", gameAddress);
            String userCommand = Main.scanner.next().toLowerCase().trim();

            if(userCommand.equals("q")){
                System.out.println("Thank you, be sure to play again next time!"); break;
            }
            else if (userCommand.equals("s")) {
                Main.isFirstGame = false;
                Main.startGame();
            }
        }
    }
}

