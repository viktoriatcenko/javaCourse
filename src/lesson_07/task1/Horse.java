package lesson_07.task1;

public class Horse extends Animal {
    private boolean canJump;

    public boolean isCanJump() {
        return canJump;
    }

    public void setCanJump(boolean canJump) {
        this.canJump = canJump;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
