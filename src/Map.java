/**
 * Created by zyongliu on 11/11/16.
 */
public class Map {

    public Map() {
    }

    public String checkManPosition(Man man) {
        if (man.getPosition() == 1) {
            return "Empty Land, buy or not?";
        }
        return null;
    }
}
