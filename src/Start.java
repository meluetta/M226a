import java.util.ArrayList;

public class Start {
    /**
     * @author Mia Rascher
     * @version 2.0
     * @since 1.0
     * @throws Exception e
     * @param args, array1
     */
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        Generator generator = new Generator();
        Gameloop gameloop = new Gameloop();

        try{
            generator.generateArraylist(array1);
        }catch(Exception e){
            System.out.println("Failed to generate Arraylist.");
        }
        try{
            generator.generateMine(array1);
        }catch(Exception e){
            System.out.println("Failed to generate Mine.");
        }
        try{
            gameloop.gameloop(array1, generator.mine);
        }catch(Exception e){
            System.out.println("Failed to start Gameloop");
        }

    }
}
