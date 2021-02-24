package GuideToTheGalaxy.Enums;

public enum Size {
    Small(1), Medium(2), Large(3);

    public int getNumSize() {
        return numSize;
    }

    private int numSize;

    Size(int num) {
        numSize = num;
    }

}
