import java.util.ArrayList;

public class Generator {
    /**
     * @author Mia Rascher
     * @version 2.0
     * @since 2.0
     * @throws
     * @param args
     */

    private int min = 0;
    private int max = 100;
    protected int mine = 0;
    private int mine_position = 0;

    public void generateArraylist(ArrayList<Integer> array1){
        for (int i = 0; i < 5; i++) {
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            array1.add(random_int);
        }
    }
    public void generateMine(ArrayList<Integer> array1){
        mine_position = (int)Math.floor(Math.random()*(4-min+1)+min);
        mine = array1.get(mine_position);
    }

}
