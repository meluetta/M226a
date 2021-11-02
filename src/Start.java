import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    /**
     * @author Mia Rascher
     * @version 2.0
     * @since 1.0
     * @throws 
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        Generator generator = new Generator();
        Gameloop gameloop = new Gameloop();

        generator.generateArraylist(array1);
        generator.generateMine(array1);
        gameloop.gameloop(array1, generator.mine);
    }
}
