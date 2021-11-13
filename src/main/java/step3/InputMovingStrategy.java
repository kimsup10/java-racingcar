package step3;

public class InputMovingStrategy implements MovingStrategy{
    private static final int MOVING_THRESHOLD = 4;
    private final int input;

    public InputMovingStrategy(int input) {
        this.input = input;
    }

    @Override
    public Boolean run() {
        return this.input >= 4;
    }
}
