import java.util.ArrayList;
import java.util.Scanner;

public class Gameloop {
    /**
     * @author Mia Rascher
     * @version 2.0
     * @since 2.0
     * @throws
     * @param args
     */
    private int counter = 5;
    private int chosenNumber;
    private int chosenNumberPosition = 0;
    private Scanner scanner = new Scanner(System.in);
    private Start start = new Start();
    private String restart = "";

    public void gameloop(ArrayList<Integer> array1, int mine){
        while(counter > 1){
            System.out.println("Choose your Number: ");
            for (int i : array1) {
                System.out.println(i);
            }
            chosenNumber = scanner.nextInt();

            for(int x = 0; x < counter; x++){
                if(array1.get(x) == chosenNumber){
                    chosenNumberPosition = x;
                }
            }

            if(mine == chosenNumber){
                System.out.println("BOOM! You found the mine! You loose! Do you want to play again?\n");
                restart = scanner.next();
                if(restart.equals("y")){
                    String[] arguments = new String[] {"123"};
                    Start.main(arguments);
                }else {
                    System.exit(1);
                }
            }else{
                System.out.println("GZ! You didnt hit the mine!\n-------------------------\n");
                counter--;
                array1.remove(chosenNumberPosition);
            }
        }
        System.out.println("Congratulations! You won! You didnt hit the Mine! Do you want to play again? (y/n)\n");
        restart = scanner.next();
        if(restart.equals("y")){
            String[] arguments = new String[] {"123"};
            Start.main(arguments);
        }else {
            System.exit(1);
        }
    }
}
