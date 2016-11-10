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
}
