import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by zyongliu on 11/11/16.
 */
public class ManTest {

    public static final int STEP = 1;

    @Test
    public void should_change_position_when_man_roll() throws Exception {
        Man man = new Man();
        int position = man.getPosition();
        man.roll(STEP);
        assertThat(man.getPosition(), is(position + STEP));
    }

    @Test
    public void should_buy_building_when_man_on_the_empty_land() throws Exception {
        Man man = new Man();
        man.roll(STEP);
        Building building = new Building(man.getPosition());
        int money = man.getMoney();
        int buildingNum = man.getBuildingNum();
        man.buyBuilding(building);
        assertThat(man.getMoney(), is(money - building.getPrice()));
        assertThat(man.getBuildingNum(), is(buildingNum + 1));
    }
}
