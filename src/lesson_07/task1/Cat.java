package lesson_07.task1;

public class Cat extends Animal {

    private boolean canMeow;

    public boolean isCanMeow() {
        return canMeow;
    }

    public void setCanMeow(boolean canMeow) {
        this.canMeow = canMeow;
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
