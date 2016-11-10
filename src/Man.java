/**
 * Created by zyongliu on 11/11/16.
 */
public class Man {
    private int position;

    public Man() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void roll(int step) {
        position += step;
    }
}
