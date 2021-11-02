import java.util.ArrayList;

public class Generator {
    /**
     * @author Mia Rascher
     * @version 3.2
     * @since 2.0
     * @throws Exception e
     * @param args, array1
     * @methods generateArraylist, generateMine
     * @description Generator Class where the random Numbers and the Mine get generated and inserted in the Array
     */

    private int min = 0;
    private int max = 100;
    protected int mine = 0;
    private int mine_position = 0;

    public void generateArraylist(ArrayList<Integer> array1){
        try{
            for (int i = 0; i < 10; i++) {
                int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                array1.add(random_int);
            }
        }catch(Exception e){
            System.out.println("Failed to generate random Numbers in Arraylist.");
        }

    }
    public void generateMine(ArrayList<Integer> array1){
        try{
            mine_position = (int)Math.floor(Math.random()*(4-min+1)+min);
            mine = array1.get(mine_position);
        }catch(Exception e){
            System.out.println("Failed to generate Mine.");
        }

    }

}
