import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    /**
     * @author Mia Rascher
     * @version 1.0
     * @since 1.0
     * @throws 
     * @param args
     */
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        ArrayList<Integer> array1 = new ArrayList<>();
        int mine;
        int mine_position;
        int chosenNumber;
        int chosenNumberPosition = 0;
        int counter = 5;
        Scanner scanner = new Scanner(System.in);
        String restart = "";

        for (int i = 0; i < 5; i++) {
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            array1.add(random_int);
        }

        mine_position = (int)Math.floor(Math.random()*(4-min+1)+min);
        mine = array1.get(mine_position);

        while(counter > 1){
            System.out.println("Choose your Number: \n");
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
                System.out.println("BOOM! You found the mine! You loose!\n");
                System.exit(1);
            }else{
                System.out.println("GZ! You didnt hit the mine!\n");
                counter--;
                array1.remove(chosenNumberPosition);
            }
        }
        System.out.println("Congratulations! You won! You didnt hit the Mine! Do you want to play again? (y/n)\n");
        restart = scanner.next();
        if(restart.equals("y")){
            System.out.println("uwu");
        }else{
            System.exit(1);
        }
    }
}
