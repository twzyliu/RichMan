import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by zyongliu on 11/11/16.
 */
public class MapTest {

    public static final int STEP = 1;

    @Test
    public void should_return_buy_when_man_on_the_empty_land() throws Exception {
        Man man = new Man();
        man.roll(STEP);
        Map map = new Map();
        assertThat(map.checkManPosition(man), is("Empty Land, buy or not?"));
    }
}
