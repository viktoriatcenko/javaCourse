package lesson_07.task1;

public class Dog extends Animal {

    private boolean canBringTheBone;

    public boolean isCanBringTheBone() {
        return canBringTheBone;
    }

    public void setCanBringTheBone(boolean canBringTheBone) {
        this.canBringTheBone = canBringTheBone;
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
