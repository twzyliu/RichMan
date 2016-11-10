import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyongliu on 11/11/16.
 */
public class Man {
    private int position;
    private int money;
    private List<Building> buildings;

    public Man() {
        this.position = 0;
        this.money = 20000;
        buildings = new ArrayList<>();
    }

    public int getPosition() {
        return position;
    }

    public void roll(int step) {
        position += step;
    }

    public int getMoney() {
        return money;
    }

    public void buyBuilding(Building building) {
        buildings.add(building);
        money -= building.getPrice();
    }

    public int getBuildingNum() {
        return buildings.size();
    }
}
