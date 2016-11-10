/**
 * Created by zyongliu on 11/11/16.
 */
public class Building {
    private int position;
    private int level;
    private int price;

    public Building(int position) {
        this.position = position;
        this.level = 0;
        this.price = 200;
    }

    public int getPrice() {
        return price;
    }
}
